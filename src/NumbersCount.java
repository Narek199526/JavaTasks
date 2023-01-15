public class NumbersCount {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1,};
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]){
                count++;
            }
        }
        System.out.println("The count is " + count);
    }
}
