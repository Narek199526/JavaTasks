package bankCard;

public class Main {
    public static void main(String[] args) {
       Gold gold = new Gold("NAREK", "POGHOSYAN", "1234567890123456", 2024);
       gold.setMany(150000);
       gold.getMany(15000);
       gold.getMany(2000);
       gold.getMany(35000);
       gold.onlineShop(18000);
        System.out.println(gold);
        System.out.println(gold.getBonusPoint());

        Business business = new Business("POGHOS", "POGHOSYAN", "2222222222222222", 2030);
        business.setMany(200000);
        business.onlineShop(45600);
        System.out.println(business);
        System.out.println(business.getBalance());
    }
}
