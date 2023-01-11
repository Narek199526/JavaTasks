public class SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, -8, 0, -9, 6, -38};
        int[] arr2 = {-3, 5, -9, 0, 2, -5, 15, 48};
        int[] arr3 = new int[arr1.length];
        System.out.print("The members of arr3 are ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = 0;
            }
            System.out.print(arr3[i] + ", ");
        }
    }
}
