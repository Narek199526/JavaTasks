package inheritance;

class Employee extends Person {
    private String specialization;
    private int salary;

    Employee(String name, String surname, String address, int age, int phoneNumber, String specialization, int salary) {
        super(name, surname, address, age, phoneNumber);
        setSpecialization(specialization);
        setSalary(salary);
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }


    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else System.exit(1);
    }

    public int getSalary() {
        return salary;
    }
}
