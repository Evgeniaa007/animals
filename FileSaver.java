import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver {
    public void saveToFile(ArrayList<String> animals) {
        try (FileWriter writer = new FileWriter("file.txt")){
            for (String animal : animals) {
                writer.write(animal + "\n");
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
}
