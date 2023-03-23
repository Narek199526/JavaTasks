package bankCard;

public class Standart{
    protected String name;
    protected String lastName;
    protected long cardNumber;
    protected int expirationYear;
    protected int balance;

    Standart(String name,String lastName, long cardNumber, int expirationYear ){
        setName(name);
        setLastName(lastName);
        setCardNumber(cardNumber);
        setExpirationYear(expirationYear);
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


    public void setCardNumber(long cardNumber) {
        if (checkCardNumber(cardNumber)) {
            this.cardNumber = cardNumber;
        }else System.exit(1);
    }

    public long getCardNumber() {
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

    public boolean checkCardNumber(long number){
        int count = 1;
        while (number / 10 != 0){
            number = number / 10;
            count++;
        }
        if (count == 16){
            return true;
        } else System.exit(1);
        return false;
    }
}
