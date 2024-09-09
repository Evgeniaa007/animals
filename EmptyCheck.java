public class EmptyCheck extends CreationException {

    public EmptyCheck(){
        super();
        System.out.println("Для добавления животного нужно заполнить все поля");
    }
        
}
