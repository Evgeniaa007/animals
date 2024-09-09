import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistryFunctions {

    public static List<Animal> animals = new ArrayList<>();

    public static void newAnimal() {
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
                    return;
            }
        }
        catch(Exception e){
            throw new CreationException();
        }

        animals.add(animal);
        System.out.println("Животное добавлено.");

    }

    public static void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("В реестре нет животных.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    public static void displayCommands() {
        boolean flag = true;
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, чьи команды вы хотите увидеть: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                System.out.println(name + " знает команды: " + animal.getCommands());
                flag = false;
            }
        }
        if (flag){
            System.out.println("Такого животного нет в реестре");
        }
    }

    public static void addNewCommand() {
        boolean flag = true;
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, которое выучило новую команду: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
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
