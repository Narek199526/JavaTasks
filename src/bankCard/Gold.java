package bankCard;

public class Gold extends Standart{
    private int amountForLunch = 100000;
   private int bonusPoint;
    private int lunchPayment (int amount) {
        if (amount > 0 && amount < amountForLunch) {
                amountForLunch -= amount;
                return amount;
        } else System.exit(1);
        return 0;
    }


    @Override
    public int getMany(int amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            bonusPoint += 2;
            return amount;
        }else System.exit(1);
        return 0;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}
