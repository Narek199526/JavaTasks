package electricEquipment.headPhones;

import electricEquipment.Card;
import electricEquipment.ElectricShop;

public  class Airpods extends Headphones{
    Airpods(String model, String name, double costPrice) {
        super(model, name, costPrice);
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
            double selPrice = getSalePrice(this.costPrice) + (salePrice / 8);
            ElectricShop.income += selPrice;
            ElectricShop.profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public double getSalePrice(double costPrice) {
        return costPrice + (costPrice / 8);
    }
}
