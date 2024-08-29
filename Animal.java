import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Animal {
    private static int counter;
    private String name;
    private LocalDate birthDate; 
    private Species species;
    private HashSet<String> commands = new HashSet<String>();


    public Animal(String name, LocalDate birthDate, String species){
        ++counter;
        this.name = name;
        this.birthDate = birthDate;
        setSpecies(species);
    }

    public static int getCounter() {
        return counter;
     }
  

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Species getSpecies(Species species) {
        return species;
    }

    public void setSpecies(String species) {
        switch (species.toLowerCase()) {
            case ("cat"):
                this.species = Species.CAT;
                break;
            case ("dog"):
                this.species = Species.DOG;
                break;
            case ("hamster"):
                this.species = Species.HAMSTER;
                break;
            case ("horse"):
                this.species = Species.HORSE;
                break;
            case ("camel"):
                this.species = Species.CAMEL;
                break;
            case ("donkey"):
                this.species = Species.DONKEY;
                break;
        }
    }

    public String getCommands() {
        return commands.toString();
    }
    
    public void setCommands(HashSet<String> commands) {
        this.commands = commands;
    }
 
    @Override
    public String toString() {
        return String.format("Name: %s, Birthdate: %t, Speciees: %s", name, birthDate, species);
    }

}