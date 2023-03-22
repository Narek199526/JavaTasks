package bankCard;

public class Main {
    public static void main(String[] args) {
       Gold gold = new Gold();
       gold.setMany(150000);
       gold.getMany(15000);
       gold.getMany(2000);
       gold.getMany(35000);
       gold.onlineShop(18000);
        System.out.println(gold.getBalance());

        Business business = new Business();
        business.setMany(200000);
        business.onlineShop(45600);
        System.out.println(business.getBalance());
    }
}
