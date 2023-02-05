package methods;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1;
        if (numberArmstrong(num))System.out.println(num + " is armstrong");
         else System.out.println(num + " isn't armstrong");
    }

    static boolean numberArmstrong(int num) {
        int initialNumber = num;
        int numberDegree = 1;
        int numberDegreeSum = 0;
        int numberLength = numberLength(num);
        while (num > 0) {
            numberDegree = num % 10;
            for (int i = 1; i < numberLength; i++) {
                numberDegree = numberDegree * (num % 10);
            }
            numberDegreeSum += numberDegree;
            num /= 10;
        }
        if (initialNumber == numberDegreeSum) {
            return true;
        } else return false;
    }

    static int numberLength(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
