package models;
public class Horse extends Animal {

    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }  
    
    @Override
    public String getSpecies() {
        return "Horse";
    }
}
