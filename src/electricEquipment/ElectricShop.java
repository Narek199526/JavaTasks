package electricEquipment;

public abstract class ElectricShop {
    protected double costPrice;
    protected double salePrice ;
    public static double income;
    public static double profit;
    protected boolean cnd = true;

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
