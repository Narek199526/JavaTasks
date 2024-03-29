package electricEquipment.tvSet;

import electricEquipment.Card;
import electricEquipment.ElectricEquipment;
import electricEquipment.ElectricShop;

public  class TVSet extends ElectricEquipment {
    protected int diagonalLine;

    TVSet(String model, String name, double costPrice, int diagonalLine){
        super(model, name, costPrice);
        setDiagonalLine(diagonalLine);
    }

    public void setDiagonalLine(int diagonalLine) {
        if (diagonalLine > 0) {
            this.diagonalLine = diagonalLine;
        } else System.exit(1);
    }


    @Override
    public void cashSel() {
        if (cnd) {
            double selPrice = getSalePrice(this.costPrice);
            ElectricShop.income += selPrice;
            ElectricShop.profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public void payFromCard(Card ob) {
        if (cnd) {
            double selPrice = getSalePrice(this.costPrice);
            ElectricShop.income += ob.payFromCard(this.costPrice);
        }
        cnd = false;
    }

    @Override
    public void creditSel() {
        if (cnd) {
            double selPrice = getSalePrice(this.costPrice) + (salePrice / 5);
            ElectricShop.income += selPrice;
            ElectricShop.profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public double getSalePrice(double costPrice) {
        return costPrice + (costPrice / 5);
    }
}
