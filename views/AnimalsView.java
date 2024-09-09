package views;
import java.util.List;
import java.util.Scanner;

import models.Animal;
import presenters.View;

public class AnimalsView implements View {
    public void addResult(List<Animal> animals) {
        System.out.println("Животное добавлено.");
    }

    public void showAllAnimals(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println("В реестре нет животных.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    public void displayCommands(List<Animal> animals) {
        boolean flag = true;
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, чьи команды вы хотите увидеть: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println(name + " знает команды: " + animal.getCommands());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Такого животного нет в реестре");
        }
    }

    public void addNewCommand(List<Animal> animals) {
        boolean flag = true;
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, которое выучило новую команду: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.print("Введите выученную команду: ");
                String command = scanner.nextLine();
                animal.learnCommand(command);
                System.out.print(name + " выучил команду: " + command);
                flag = false;
            }
        }
        if (flag){
            System.out.println("Такого животного нет в реестре");
        }
    }

}
