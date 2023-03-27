package school;

public class Teacher {
    protected String name;
    protected String lastName;
    protected double salary = 150000;
    protected double coefficient;

    Teacher(String name, String lastName, double coefficient) {
        this.name = name;
        this.lastName = lastName;
        this.coefficient = coefficient;
        printSalary();
    }

    public double getSalary(double coefficient) {
        if (coefficient > 0 && coefficient <= 2) {
            return salary * coefficient;
        } else System.exit(1);
        return 0;
    }

    public void printSalary() {
        System.out.println("The teacher salary is " + getSalary(coefficient));
    }

}
