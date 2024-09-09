import java.util.ArrayList;
import java.util.List;

import models.Animal;
import presenters.MenuSelection;


public class Program {
    List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        new MenuSelection().run();
    }
}
