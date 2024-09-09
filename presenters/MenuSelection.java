package presenters;

import java.util.Scanner;

import models.RegistryFunctions;
import views.AnimalsView;
import views.ConsoleMenu;

public class MenuSelection {

    Model model = new RegistryFunctions();
    View view = new AnimalsView();
    AnimalsPresenter presenter = new AnimalsPresenter(model, view);


    public void run() {
        try (Counter counter = new Counter()) {
            while (true) {
                ConsoleMenu.menuConsole();

                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                scanner.nextLine();
                switch (number) {
                    case 1:
                        presenter.showAllAnimalsPresenter();
                        break;
                    case 2:
                        presenter.addNewAnimalPresenter();
                        break;
                    case 3:
                        presenter.displayCommandsPresenter();
                        break;
                    case 4:
                        presenter.addNewCommandPresenter();
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
