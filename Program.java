import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        
        Animal dog1 = new Dog("Плюша", LocalDate.of(2021, 9, 3), "dog");
        Animal hamster1 = new Hamster("Хан", LocalDate.of(2024, 4, 11), "hamster");
        
        String dogString1 = dog1.toString();
        String hamsteString1 = hamster1.toString();

        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(dogString1);
        zoo.add(hamsteString1);

        FileSaver save = new FileSaver();
        save.saveToFile(zoo);
    }

    
}
