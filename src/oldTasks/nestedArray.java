package oldTasks;

public class nestedArray {
    public static void main(String[] args) {
        int[][] nestedArray ={{1, 2, 3, 4, 5},{15, 65, 98, 56,}, {42, 69, 45}};
        int firstMember = 0;
        int lastMember = 0;
        for (int i = 0; i < nestedArray.length; i++) {
            firstMember = nestedArray[i][0];
            lastMember = nestedArray[i][nestedArray[i].length -1];
            System.out.println("The first member is " + firstMember + " last member is " + lastMember);
        }

    }
}
