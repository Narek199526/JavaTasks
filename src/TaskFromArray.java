public class TaskFromArray {
    public static void main(String[] args) {
        double input[] = {-5.3, -6.1, -4.5, -9.8, -1.4};
        double output[] = new double[5];
        int i = 0;
        int j = 0;
        if (input[i] >=0){
            output[j] = input[i];
            j++;
        }
        i++;
        if (input[i] >=0){
            output[j] = input[i];
            j++;
        }
        i++;
        if (input[i] >=0){
            output[j] = input[i];
            j++;
        }
        i++;
        if (input[i] >=0){
            output[j] = input[i];
            j++;
        }
        i++;
        if (input[i] >=0){
            output[j] = input[i];
            j++;
        }
        i++;
        System.out.print("Input array members = " + input[0] + ", ");
        System.out.print(input[1] + ", ");
        System.out.print(input[2] + ", ");
        System.out.print(input[3] + ", ");
        System.out.println(input[4] + " ");
        System.out.print("Output array members = " + output[0] + ", ");
        System.out.print(output[1] + ", ");
        System.out.print(output[2] + ", ");
        System.out.print(output[3] + ", ");
        System.out.print(output[4]);
    }
}
