package school;

public class HeadTeacher extends Teacher{
    HeadTeacher(String name, String lastName, double coefficient){
        super(name, lastName, coefficient);
    }

    @Override
    public void printSalary(){
        System.out.println("The head teacher salary is " + getSalary(coefficient) );
    }
}
