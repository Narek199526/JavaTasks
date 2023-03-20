package bankCard;

public class Standart{
    protected int balance;

    public void setMany(int money){
        if (money > 0){
            balance += money;
        } else System.exit(1);
    }


    public int getMany(int money){
        if (money <= balance){
            balance -= money;
            return money;
        }else {
            System.exit(1);
            return 0;//Բայց էս պահը միքիչ սրտովս չի
        }
    }
}
