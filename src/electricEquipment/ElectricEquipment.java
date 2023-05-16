package electricEquipment;

import bankCard.Standart;

public abstract class ElectricEquipment  {
    protected String model;
    protected String name;
    protected boolean cnd = true;
    protected double costPrice;
    protected double salePrice ;

   public ElectricEquipment(String model, String name, double costPrice){
        super();
        this.model = model;
        this.name = name;
        setCostPrice(costPrice);
    }

    public abstract void cashSel();

    public abstract void payFromCard(Card ob);

    public abstract void creditSel();


    public void setCostPrice(double costPrice) {
        if (costPrice > 0) {
            this.costPrice = costPrice;
        } else System.exit(1);
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice(double costPrice) {
        return salePrice;
    }
}
