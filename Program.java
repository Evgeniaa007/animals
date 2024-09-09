import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        try (Counter counter = new Counter()) {
            while (true) {
                String text = " Меню \n " +
                        "1. Показать всех животных в реестре \n " +
                        "2. Завести новое животное  \n " +
                        "3. Показать команды, которые знает животное \n " +
                        "4. Обучить животное новой команде \n " +
                        "0. Выйти из реестра  \n" +
                        " ";
                System.out.println(text);

                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                scanner.nextLine();
                switch (number) {
                    case 1:
                        RegistryFunctions.showAllAnimals();
                        break;
                    case 2:
                        RegistryFunctions.newAnimal();
                        break;
                    case 3:
                        RegistryFunctions.displayCommands();
                        break;
                    case 4:
                        RegistryFunctions.addNewCommand();
                        break;
                    case 0:
                        System.out.println("Вы вышли из реестра");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Функции не существует. Повторите выбор.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
