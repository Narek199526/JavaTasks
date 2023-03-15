package inheritance;

class Employee  extends Person{
   private String specialization;
   private int salary;


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
