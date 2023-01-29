package methods;

public class SquareByMethod {
    public static void main(String[] args) {
        System.out.println(sqr(2, -1));
    }

    static double sqr(int a, int b) {
        double c = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            c *= a;
        }
        if (Math.abs(a) > 10 || Math.abs(b) > 10) {
            System.out.print("You need to correct your inputs and exit cod is ");
            return -1;
        }else if (a > 0 && b > 0)
            System.out.print(a + "'s " + " degree " + b + " is ");
        else if (a < 0) {
            System.out.print("You need to correct your inputs and exit cod is ");
            return -2;
        } else if (b < 0) {
            System.out.print(a + "'s " + " degree " + b + " is ");
            return ((double)1 / c);
        }
        return c;
    }
}
