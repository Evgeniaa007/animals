package models;
public class Dog extends Animal{

    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }
   
    @Override
    public String getSpecies() {
        return "Dog";
    }

}
