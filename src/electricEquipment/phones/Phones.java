package electricEquipment.phones;

import electricEquipment.Card;
import electricEquipment.ElectricEquipment;
import electricEquipment.ElectricShop;

public  class Phones extends ElectricEquipment {
   protected double memory;
   Phones(String model, String name, double costPrice, double memory){
       super(model, name, costPrice);
       setMemory(memory);
   }


    public void setMemory(double memory) {
        if (memory > 0) {
            this.memory = memory;
        } else System.exit(1);
    }

    public double getMemory() {
        return memory;
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
            double selPrice = getSalePrice(this.costPrice) + (salePrice / 6);
            ElectricShop.income += selPrice;
            ElectricShop.profit += (selPrice - this.costPrice);
        }
        cnd = false;
    }

    @Override
    public double getSalePrice(double costPrice) {
        return costPrice + (costPrice / 6);
    }
}
