package exeption;

public class ExampelsFromBook {
    public static void main(String[] args) {
       try {
           divisonByZero(5, 0);
       } catch (ArithmeticException e){
           System.out.println("You cant divide by zero");
       }
    }


   static void divisonByZero (int a, int b){
        int c;
       try {
           c = a / b;
       } catch (ArithmeticException e){
           System.out.println("its good");
       }
    }
}
