package bankCard;

public class Business extends Standart {
    boolean cnd = true;

    public void getCredit() {
        if (cnd) {
            balance += 1000000;
            cnd = false;
        }
    }
}
