package collections;

import electricEquipment.computers.Acer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(-1);
        arrayList.add(5);
        System.out.println(ReturnPositiveNumbers.positiveNumbers(arrayList));

    }
}
