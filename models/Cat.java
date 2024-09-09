package models;
public class Cat extends Animal {

    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }
    
    @Override
    public String getSpecies() {
        return "Cat";
    }

}
