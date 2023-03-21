package bankCard;

public class Gold extends Standart{
    private int manyForLunch = 100000;
    private int lunchPayment (int howMach) {
        if (howMach > 0) {
            if (howMach < manyForLunch) {
                manyForLunch -= howMach;
                return howMach;
            } else System.exit(1);
            return 0;//Բայց էս պահը միքիչ սրտովս չի
        } else System.exit(1);
        return 0;
    }
}
