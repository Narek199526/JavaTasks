package generics;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        DinamicArray <Integer> array = new DinamicArray();
        array.add(1);
        array.add(2);
        array.add(20);
        array.add(130);
        array.add(104);
        array.add(105);
        array.add(106);
        array.add(107);
        array.add(108);


        array.add(1, 15);
        array.remove(0);
        for (int i = 0; i < array.size(); i++) {
           int element = array.getElement(i);
             System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(array.size());

    }

}
