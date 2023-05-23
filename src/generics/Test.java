package generics;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(1, 2, 3);
        Box<Integer> box1 = new Box<>(1, 2, 3);

       System.out.println(Box.sum(box, box1));
    }

}
