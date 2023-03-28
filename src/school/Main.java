package school;

public class Main {
    public static void main(String[] args) {
        Teacher teacher;
        teacher = new Teacher("Marine", "Sinanyan", 150000);
        System.out.println(teacher.getSalary());
        teacher = new HeadTeacher("Ashot", "Manukyan", 200000, 1.5);
        System.out.println(teacher.getSalary());
        teacher = new SchoolDirector("Marine", "Sinanyan", 300000);
        System.out.println(teacher.getSalary());
    }
}
