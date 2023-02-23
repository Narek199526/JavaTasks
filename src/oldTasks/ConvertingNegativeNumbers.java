package oldTasks;

public class ConvertingNegativeNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 8, -6, -5, -3, 9, 45};
        int num = 0;
        System.out.print("The arr members are ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
                num++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The negative members count is " + num);
        System.out.println("The positive members count is " + (arr.length - num));
    }
}

