package collections;

import java.util.ArrayList;

public class RemoveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(10);
        arrayList.add(14);
        arrayList.add(10);
        arrayList.add(15);
        System.out.println(arrayList);
        System.out.println(arrayList);
        int arrayListFirstElements = arrayList.get(0);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
          if (arrayList.get(i) == arrayListFirstElements){
              arrayList.remove(i);
          }
        }
        System.out.println(arrayList);
    }
}
