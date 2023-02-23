package oldTasks;

import java.util.Scanner;

public class TaskFromClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the umber between 1 - 12");
        int clockNum = scanner.nextInt();
        if (clockNum >= 1 && clockNum <= 12) {
            switch (clockNum) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                    System.out.println("past " + clockNum * 5);
                    break;
                case 12:
                    System.out.println("It is round our");
                    break;
            }
        } else {
            System.out.println("Don't correct number");
            System.exit(1);
        }
    }
}
