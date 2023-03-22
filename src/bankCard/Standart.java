package bankCard;

public class Standart{
    protected int balance;

    public int getBalance() {
        return balance;
    }

    public void setMany(int amount){
        if (amount > 0){
            balance += amount;
        } else System.exit(1);
    }


    public int getMany(int amount){
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return amount;
        }else System.exit(1);
        return 0;
    }

    public void onlineShop(double amount){
        if (amount > 0 && amount < balance){
            balance -= amount;
        } else {
            System.exit(1);
        }
    }
}
