package oldTasks;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the month number between 1-12: ");
        int month = scanner.nextInt();
        int days;
        if (month > 0 && month < 13) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    System.out.println("The month " + month + " has " + days + " days");
                    break;
                case 2:
                    System.out.println("The month " + month + " has 28 or 29 days");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("The month " + month + " has 30 days");
                    break;
            }

        } else {
            System.out.println("Invalid month number");
            System.exit(1);
        }
    }
}
