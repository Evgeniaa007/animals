import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistryFunctions {

    public static List<Animal> animals = new ArrayList<>();

    public static void newAnimal(Counter counter) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Выберите животное, которое хотите добавить в реестр: \n cat, dog, hamster, horse, donkey, camel");
        String type = scanner.nextLine().toLowerCase();
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения животного: ");
        String birthDate = scanner.nextLine();

        Animal animal = null;
        switch (type) {
            case ("cat"):
                animal = new Cat(name, birthDate);
                break;
            case ("dog"):
                animal = new Dog(name, birthDate);
                break;
            case ("hamster"):
                animal = new Hamster(name, birthDate);
                break;
            case ("horse"):
                animal = new Horse(name, birthDate);
                break;
            case ("camel"):
                animal = new Camel(name, birthDate);
                break;
            case ("donkey"):
                animal = new Donkey(name, birthDate);
                break;
            default:
                System.out.println("В реестр нельзя внести такое животное.");
                return;
        }
        //scanner.close();
        if (name.isEmpty() || birthDate.isEmpty()) {
            throw new Exception("Для добавления животного нужно заполнить все поля");
        }

        animals.add(animal);
        counter.add();
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, чьи команды вы хотите увидеть: ");
        String name = scanner.nextLine();
        scanner.close();
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                System.out.println(name + "знает команды: " + animal.getCommands());
                return;
            }
        }
        System.out.println("Животого нет в реестре.");
    }

    public static void addNewCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя животного, которое выучило новую команду: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                System.out.print(name + "выучил команду: ");
                String command = scanner.nextLine();
                animal.learnCommand(command);
            }
        }
        scanner.close();
        System.out.println("Животого нет в реестре.");
    }
}
