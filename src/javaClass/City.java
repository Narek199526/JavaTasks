package javaClass;

public class City {
    String name = "Not defined";
    String whichCountryIsItIn;
    int populationSize;
    int yearOfEstablishment;
    City(String wC, int p, int y){
        whichCountryIsItIn = wC;
        populationSize = p;
        yearOfEstablishment = y;
    }

    public static void main(String[] args) {
        City city1 = new City("Armenia", 20000, 1885);
        if (city1.name.equals("Not defined")){
            city1.name = "Goris";
        }
        System.out.println("City name is " + city1.name);
        System.out.println("The city " + city1.name + " is located in " + city1.whichCountryIsItIn);
        System.out.println("In the city " + city1.name + " leaves " + city1.populationSize + " people ");
        System.out.println("The city " + city1.name + " established in " + city1.yearOfEstablishment);
    }

}
