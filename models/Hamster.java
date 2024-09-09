package models;
public class Hamster extends Animal {

    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getSpecies() {
        return "Hamster";
    }
}
