package inheritance;

public class Manager  extends Employee{
    String department;


    Manager(String name, String surname, String address, int age, int phoneNumber, String specialization, int salary, String department){
        setName(name);
        setSurname(surname);
        setAddress(address);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setSpecialization(specialization);
        setSalary(salary);
        setDepartment(department);
    }


    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
