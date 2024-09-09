import java.util.ArrayList;

public abstract class Animal {
    protected int id;
    protected String name;
    protected String birthDate; 
    protected ArrayList<String> commands = new ArrayList<>();
   
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
        
        public void learnCommand(String command) {
            this.commands.add(command);
        }
    
        @Override
        public String toString() {
            return String.format("Name: %s, Birthdate: %s, Speciees: %s, Learned commands: %s", name, birthDate, getSpecies(), commands);
        }

}