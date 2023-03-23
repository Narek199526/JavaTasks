package bankCard;

public class Business extends Standart {
    boolean cnd = true;

    Business(String name,String lastName, long cardNumber, int expirationYear){
        super(name, lastName, cardNumber, expirationYear);
    }

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

    @Override
    public String toString(){
        return  getName() + " " + getLastName() + "\n" + getCardNumber() + "\n" + getExpirationYear();
    }

}
