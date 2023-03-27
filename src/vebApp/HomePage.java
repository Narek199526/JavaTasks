package vebApp;

public class HomePage extends Account {
    String name;
    String lastName;
    int age;


//////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

////////////////////////////////////////////////
    public void setSerName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

 //////////////////////////////////////////////

    public void setAge(int age) {
        if (age >= 15){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
