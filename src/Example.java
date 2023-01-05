public class Example {
    public static void main(String[] args) {
       // The sum of a and b squares
        int c;
        int a = 2;
        int b = 3;
        c = a * a + b * b;
        System.out.println("The value of c = " + c);

        // The volume of the table.
        a = 2;
        b = 4;
        c = 1;
        System.out.println("The volume of the table = " + (a + b) / 2 * c);

        //Printing digits of a three-digit number
        int num = 999;
        System.out.println(num / 100);
        num %= 100;
        System.out.println(num / 10);
        num %= 10;
        System.out.println(num);

        System.out.println((char) 97);
    }
}
