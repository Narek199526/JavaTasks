package electricEquipment.headPhones;

import electricEquipment.Card;
import electricEquipment.ElectricEquipment;

public abstract class Headphones extends ElectricEquipment {
    Headphones(String model, String name, double costPrice){
    super(model, name, costPrice);
    }
}
