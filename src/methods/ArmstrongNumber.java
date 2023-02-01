package methods;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int numberDegreeSum = numberArmstrong(num);
        if (num == numberDegreeSum){
            System.out.println(num + " is armstrong");
        } else System.out.println(num + " isn't armstrong");
        }
    static  int numberArmstrong(int num){
        int numberDegree = 1;
        int numberDegreeSum = 0;
        int numberLength = numberLength(num);
        while (num > 0){
            numberDegree = num % 10;
            for (int i = 1; i < numberLength; i++) {
                numberDegree = numberDegree * (num % 10);
            }
            numberDegreeSum += numberDegree;
            num /= 10;
        }
        return numberDegreeSum;
    }

    static int numberLength(int number){
        int count = 0;
       while (number > 0){
           number = number / 10;
           count++;
       }
       return count;
    }
}
