public class Donkey extends Animal {

    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }
    @Override
    public String getSpecies() {
        return "Donkey";
    }

}
