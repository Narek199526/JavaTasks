package school;

public class Teacher {
    protected String name;
    protected String lastName;
    protected double salary;

    Teacher(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary > 0){
        this.salary = salary;
        }
        else System.exit(1);
    }

    public double getSalary() {
        return salary;
    }



}
