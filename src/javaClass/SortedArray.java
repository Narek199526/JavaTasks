package javaClass;

import javaClass.commonDenominator.Test;

public class SortedArray {
    public static void main(String[] args) {
        int[] array ={5, -23, 12, 5, 5, 12, -23, 5, 12, -23};
        boolean arrayIsSorted = true;
        while (arrayIsSorted){
            arrayIsSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                int store = 0;
                if (array[i] > array[i + 1]){
                    store = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = store;
                    arrayIsSorted = true;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
    }
}
