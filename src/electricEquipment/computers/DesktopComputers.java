package electricEquipment.computers;

import electricEquipment.Card;
import electricEquipment.ElectricShop;

public  class DesktopComputers extends Computers {
    DesktopComputers(String model, String name, double costPrice, int ram, String procesor) {
        super(model, name, costPrice, ram, procesor);
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
            double selPrice = getSalePrice(this.costPrice) + (salePrice / 10);
            ElectricShop.income += selPrice;
            ElectricShop.profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public double getSalePrice(double costPrice) {
        return costPrice + (costPrice / 20);
    }
}
