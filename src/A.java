import electricEquipment.Card;
import interfaces.MoveBack;
import interfaces.MoveLeft;
import interfaces.MoveStraight;

public class A implements MoveBack , MoveLeft {
    int a;
    int b;


    @Override
    public int reset(int a) {
        return MoveBack.super.reset(a);
    }

}


