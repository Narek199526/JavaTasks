package bankCard;

public class Main {
    public static void main(String[] args) {
        Business business = new Business();
        business.setMany(15000);
        System.out.println(business.balance);
        business.getCredit();
        System.out.println(business.balance);
        business.getCredit();
        System.out.println(business.balance);
    }
}
