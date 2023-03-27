package bankCard;

public class Gold extends Standart{
    private int amountForLunch = 100000;
   private int bonusPoint;

   Gold(String name,String lastName, String cardNumber, int expirationYear){
       super(name, lastName, cardNumber, expirationYear);
   }
    private int lunchPayment (int amount) {
        if (amount > 0 && amount < amountForLunch) {
                amountForLunch -= amount;
                return amount;
        } else System.exit(1);
        return 0;
    }


    @Override
    public int getMany(int amount){
        super.getMany(amount);
        bonusPoint += 2;
        return amount;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString(){
        return getName() + " " + getLastName() + "\n" + getCardNumber() + "\n" + getExpirationYear();
    }
}
