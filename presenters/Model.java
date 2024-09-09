package presenters;

import java.util.List;

import models.Animal;

public interface Model {

    public List<Animal> newAnimal();
    public List<Animal> showAllAnimals();

}
