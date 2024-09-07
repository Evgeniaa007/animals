import java.util.ArrayList;

public abstract class Animal {
    protected int id;
    protected String name;
    protected String birthDate; 
    protected ArrayList<String> commands;
   
    public Animal(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
        getCommands();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String getSpecies();

    public ArrayList<String> getCommands() {
            return commands;
        }
        
        public void learnCommand(String commands) {
            this.commands.add(commands);
        }
    
        @Override
        public String toString() {
            return String.format("%d. Name: %s, Birthdate: %s, Speciees: %s, Learned commands: %s", id, name, birthDate, getSpecies(), commands);
        }
/*
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
*/
/*
    public int getCounter() {
        return id;
     }
  */
    

}