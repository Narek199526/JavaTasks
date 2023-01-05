import java.util.Scanner;

public class ConstructTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Type the sides size");
        a  = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c | a + c > b | c + b > a) {
                System.out.println("With these dimensions you can construct a triangle");
            }
        } else {
            System.out.println("With these dimensions you can not construct a triangle");
        }
    }
}
