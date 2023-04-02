package electricEquipment;

import bankCard.Standart;

public abstract class ElectricEquipment extends ElectricShop {
    protected String model;
    protected String name;

   public ElectricEquipment(String model, String name, double costPrice){
        super();
        this.model = model;
        this.name = name;
        setCostPrice(costPrice);
    }
}
