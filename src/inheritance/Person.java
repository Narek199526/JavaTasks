package inheritance;

public class Person {
   private String name, surname, address;
   private int age, phoneNumber;


   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }


    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }


    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
