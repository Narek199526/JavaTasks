package oldTasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        int array[] = {6, 1, 4, 8, 9, 12};
        boolean cond = false;
        for (int i = 0; i < array.length; i++) {
            int num = 0;
            for (int j = 1; j <= array[i] / 2; j++) {
                if (array[i] % j == 0)
                    num++;
            }
            if (num == 1) {
                cond = true;
                System.out.println(array[i] + " is prime");
            }
        }
        if (!cond) {
            System.out.println("No prime number found in this array");
        }
    }
}
