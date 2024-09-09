package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.CreationException;
import exception.ExceptionFunction;
import presenters.Counter;
import presenters.Model;

public class RegistryFunctions implements Model{

    public static List<Animal> animals = new ArrayList<>();

    public List<Animal> newAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Выберите животное, которое хотите добавить в реестр: \n cat, dog, hamster, horse, donkey, camel");
        String type = scanner.nextLine().toLowerCase();
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения животного в формате DD.MM.YYYY: ");
        String birthDate = scanner.nextLine();

        Animal animal = null;
        try(Counter counter = new Counter()) {
            switch (type) {
                case ("cat"):
                    animal = new Cat(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                case ("dog"):
                    animal = new Dog(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                case ("hamster"):
                    animal = new Hamster(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                case ("horse"):
                    animal = new Horse(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                case ("camel"):
                    animal = new Camel(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                case ("donkey"):
                    animal = new Donkey(name, birthDate);
                    ExceptionFunction.emptyCheck(name, birthDate);
                    counter.add();
                    break;
                default:
                    System.out.println("В реестр нельзя внести такое животное.");
            }
        }
        catch(Exception e){
            throw new CreationException();
        }

        animals.add(animal);
        return animals;
    }

    public List<Animal> showAllAnimals() {
        return animals;
    }

}
