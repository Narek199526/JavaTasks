package electricEquipment;

public class Card {
    private static double balance;

    public void setBalance(double amount) {
        if(amount > 0){
            balance = amount;
        }else System.exit(1);
    }

    public  double payFromCard(double amount){
        if (amount > 0){
            balance -= amount;
            return amount;
        }else System.exit(1);
        return 0;
    }

}
