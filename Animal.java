import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    private static int counter;
    private String name;
    private LocalDate birthDate; 
    private ArrayList commands = new ArrayList<String>();

    public Animal(String name, LocalDate birthDate){
        ++counter;
        this.name = name;
        this.birthDate = birthDate;
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

    public String getCommands() {
        return commands.toString();
    }

    public void setCommands(ArrayList commands) {
        this.commands = commands;
    }

    

}