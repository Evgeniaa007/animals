import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Animal {
    private int id;
    private static int counter;
    private String name;
    private LocalDate birthDate; 
    private Species species;
    private HashSet<String> commands = new HashSet<String>();


    public Animal(String name, LocalDate birthDate, String species){
        id = ++counter;
        this.name = name;
        this.birthDate = birthDate;
        setSpecies(species);
    }

    public int getCounter() {
        return id;
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
        return String.format("%d. Name: %s, Birthdate: %s, Speciees: %s, Learned commands: %s", id, name, birthDate, species, commands);
    }

}