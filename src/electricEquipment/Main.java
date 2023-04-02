package electricEquipment;

import bankCard.Gold;
import electricEquipment.computers.Acer;
import electricEquipment.computers.Dell;
import electricEquipment.headPhones.AppleAirPods;
import electricEquipment.phones.Iphone;
import electricEquipment.tvSet.Hisense;

public class Main {
    public static void main(String[] args) {
        Card gold = new Card();
        gold.setBalance(10000000);
        ElectricShop equipment;

        Dell dell = new Dell("Laptop", "Dell", 300000, 8, "256 SSD");
        equipment = dell;
        equipment.cashSel();

        AppleAirPods appleAirPods = new AppleAirPods("Airpods", "Apple", 15000);
        equipment = appleAirPods;
        equipment.payFromCard(gold);

        Iphone iphone14 = new Iphone("Phone", "Iphone 14 pro", 350000, 256 );
        equipment = iphone14;
        equipment.creditSel();

        Hisense hisense = new Hisense("TV Set" ,"Hisens", 250000, 80);
        equipment = hisense;
        equipment.cashSel();

        System.out.println(ElectricShop.income);
        System.out.println(ElectricShop.profit);

    }
}
