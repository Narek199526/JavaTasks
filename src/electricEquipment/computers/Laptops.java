package electricEquipment.computers;
import electricEquipment.Card;

public  class Laptops extends Computers {
    Laptops(String model, String name, double costPrice, int ram, String procesor){
        super(model, name, costPrice, ram, procesor);

    }

    @Override
    public void cashSel() {
        if (cnd) {
             double selPrice = getSalePrice(this.costPrice);
            income += selPrice;
            profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public void payFromCard(Card ob) {
        if (cnd) {
            double selPrice = getSalePrice(this.costPrice);
            income += ob.payFromCard(this.costPrice);
        }
        cnd = false;
    }

    @Override
    public void creditSel() {
        if (cnd) {
            double selPrice = getSalePrice(this.costPrice) + (salePrice / 10);
            income += selPrice;
            profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public double getSalePrice(double costPrice) {
        return costPrice + (costPrice / 10);
    }
}
