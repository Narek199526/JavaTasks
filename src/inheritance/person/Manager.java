package inheritance.person;

import inheritance.person.Employee;

public class Manager  extends Employee {
    String department;


    Manager(String name, String surname, String address, int age, int phoneNumber, String specialization, int salary, String department){
        super(name, surname,  address, age, phoneNumber, specialization, salary);
        setDepartment(department);
    }


    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
