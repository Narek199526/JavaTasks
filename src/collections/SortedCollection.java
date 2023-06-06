package collections;

import java.util.*;

public class SortedCollection {
    public static void main(String[] args) {
        //ընդհանուր համարում եմ չստացված էս խնդիրս
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(1);
        arrayList.add(-15);
        arrayList.add(155);
        arrayList.add(14);
        arrayList.add(1);
        System.out.println(arrayList);// Եթե սա հանում եմ աշխատումա))
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(19);
        arrayList.add(-154);
        arrayList.add(15345);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);




        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
    }
}
