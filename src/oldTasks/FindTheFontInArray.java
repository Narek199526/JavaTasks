package oldTasks;

import java.util.Scanner;

public class FindTheFontInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your character ");
        char font = scanner.next().charAt(0);
        char[] array = {'a', 'd', 'h', 'g', 'u', 'r', 'o'};
        int i = 0;
        boolean cond = true;
        while (cond) {
            if (font == array[i]) {
                System.out.println("The corresponding font index is " + i);
                break;
            } else if (i == array.length -1){
                System.out.println("The font not found ");
                break;
        }
            i++;
    }
}
}
