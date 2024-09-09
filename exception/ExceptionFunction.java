package exception;
public class ExceptionFunction {
    public static void emptyCheck(String name, String birthDate){
        if (name.isEmpty() || birthDate.isEmpty()) {
            throw new EmptyCheck();
        }
    }

}
