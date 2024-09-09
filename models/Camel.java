package models;

public class Camel extends Animal {

    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getSpecies() {
        return "Camel";
    }
   
}
