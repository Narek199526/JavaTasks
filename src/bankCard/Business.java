package bankCard;

public class Business extends Standart {
    boolean cnd = true;

    public void getCredit() {
        if (cnd) {
            balance += 1000000;
            cnd = false;
        }
    }
    @Override
    public void onlineShop(double amount){
        if (amount > 0 && amount < balance){
            balance -= (amount - (amount / 10));
        } else {
            System.exit(1);
        }
    }
}
