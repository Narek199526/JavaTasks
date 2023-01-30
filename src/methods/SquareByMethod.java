package methods;

public class SquareByMethod {
    public static void main(String[] args) {
        double sqr1 = sqr(-2, -1);
       // System.out.print(a + "'s " + " degree " + b + " is ");
       // System.out.print("You need to correct your inputs and exit cod is ");
        if (sqr1 == -1){
            System.out.print("You need to correct your inputs ");
        }else if (sqr1 == -2){
            System.out.println("'a' can't be negative ");
        }else {
            System.out.print("The degree is " + sqr1);
        }
    }
    static double sqr( int a, int b) {
        double c = 1;

        if (Math.abs(a) > 10 || Math.abs(b) > 10) {
            return -1;
        } else if (a > 0 && Math.abs(b) > 0) {
            for (int i = 0; i < Math.abs(b); i++) {
                c *= a;
            }
            if (b < 0){
                c =  1 / c;
            }
        } else if (a < 0) {
            return -2;
        }
        return c;
    }
}
