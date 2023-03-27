package school;

public class SchoolDirector extends Teacher{
    SchoolDirector(String name, String lastName, double coefficient){
        super(name, lastName, coefficient);
    }


    @Override
    public void printSalary(){
        System.out.println("The school director salary is " + getSalary(coefficient) );
    }
}
