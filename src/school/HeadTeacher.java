package school;

public class HeadTeacher extends Teacher{
    double coefficient;
    HeadTeacher(String name, String lastName, double salary, double coefficient  ){
        super(name, lastName, salary);
        this.coefficient = coefficient;
    }


    public double getSalary() {
        if (coefficient > 0 && coefficient <= 2) {
            return salary * coefficient;
        } else System.exit(1);
        return 0;
    }
}
