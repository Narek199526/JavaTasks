package javaClass.commonDenominator;

public class CommonDenominator {
    public static void main(String[] args) {
        int[] array = {21, 105};
        int num = 0;
        int likelyBiggestDivider = theSmallestNumberInArray(array);


        int[] arr = new int[likelyBiggestDivider];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j <= likelyBiggestDivider; j++) {
                if(array[i] % j == 0 && array[i + 1] % j == 0 ){
                    num = j;
                }
            }
            if (num == 1){
                break;
            }
        }
        System.out.println(num);
    }
    static int theSmallestNumberInArray ( int[] array){
        int arr[];
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < num){
                num = array[i];
            }
        }
        return num;
    }
}
