package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class EqualsMethodForArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(16);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(16);
        System.out.print("arrayList " + arrayList + "\n");
        System.out.print("arrayList1 " + arrayList1 + "\n");
        System.out.println(arrayList.equals(arrayList1));
        arrayList.add(5);
        System.out.print("arrayList " + arrayList + "\n");
        System.out.print("arrayList1 " + arrayList1 + "\n");
        System.out.println(arrayList.equals(arrayList1));
        arrayList1.add(5);
        System.out.print("arrayList " + arrayList + "\n");
        System.out.print("arrayList1 " + arrayList1 + "\n");
        System.out.println(arrayList.equals(arrayList1));


        System.out.println("\n" + "\n" + "\n");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(65);
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(58);
        System.out.print("linkedList " + linkedList + "\n");
        System.out.print("linkedList1 " + linkedList1 + "\n");
        System.out.println(linkedList.equals(linkedList1));
        linkedList.add(58);
        System.out.print("linkedList " + linkedList + "\n");
        System.out.print("linkedList1 " + linkedList1 + "\n");
        System.out.println(linkedList.equals(linkedList1));
        linkedList1.add(65);
        System.out.print("linkedList " + linkedList + "\n");
        System.out.print("linkedList1 " + linkedList1 + "\n");
        System.out.println(linkedList.equals(linkedList1));
    }
}
