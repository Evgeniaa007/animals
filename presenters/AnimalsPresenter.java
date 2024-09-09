package presenters;

public class AnimalsPresenter {
    private Model model;
    private View view;

    public AnimalsPresenter(Model model, View view){
        this.model = model;
        this.view = view;
    }


    public void addNewAnimalPresenter(){
        view.addResult(model.newAnimal());
    }

    
    public void showAllAnimalsPresenter(){
        view.showAllAnimals(model.showAllAnimals());
    }


    public void displayCommandsPresenter(){
        view.displayCommands(model.showAllAnimals());
    }


    public void addNewCommandPresenter(){
        view.addNewCommand(model.showAllAnimals());
    }


    
}
