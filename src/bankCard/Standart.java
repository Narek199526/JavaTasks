package bankCard;

public class Standart{
    protected String name;
    protected String lastName;
    protected String cardNumber;
    protected int expirationYear;
    protected int balance;

    Standart(String name,String lastName, String cardNumber, int expirationYear ){
        setName(name);
        setLastName(lastName);
        setCardNumber(cardNumber);
        setExpirationYear(expirationYear);
    }

    public int getBalance() {
        return balance;
    }

    public void setExpirationYear(int expirationYear) {
        if (expirationYear > 0) {
            this.expirationYear = expirationYear;
        } else System.exit(1);
    }

    public double getExpirationYear() {
        return expirationYear;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() == 16 ) {
            this.cardNumber = cardNumber;
        }else System.exit(1);
    }

    public String getCardNumber() {
        return cardNumber;
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
