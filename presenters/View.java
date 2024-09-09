package presenters;

import java.util.List;

import models.Animal;

public interface View {
    public void addResult(List<Animal> animals);

    public void showAllAnimals(List<Animal> animals);

    public void displayCommands(List<Animal> animals);

    public void addNewCommand(List<Animal> animals);
}



