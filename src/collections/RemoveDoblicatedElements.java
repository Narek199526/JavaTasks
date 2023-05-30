package collections;

import java.util.*;

public class RemoveDoblicatedElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(15);
        arrayList.add(18);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(15);
        arrayList.add(19);
        arrayList.add(16);
        arrayList.add(18);
        arrayList.add(19);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i; j  < arrayList.size(); j++) {
                if (arrayList.get(i).doubleValue() == arrayList.get(j).doubleValue()) {
                    arrayList.remove(j);
                }
            }
        }
        System.out.println(arrayList);


        //////SECOND OPTION
        System.out.println("\n" + "\n" + "Second option ");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i:arrayList) {
            if (!arrayList1.contains(i)){
                arrayList1.add(i);
            }
        }
        System.out.println(arrayList1);



        /////////THIRD OPTION
        System.out.println("\n" + "\n" + "Third option ");
        Set<Integer> set = new HashSet<>(arrayList);
        System.out.println(set);
    }
}

