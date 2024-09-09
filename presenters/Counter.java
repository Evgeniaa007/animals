package presenters;
public class Counter implements AutoCloseable {

    public static int c;
  
    public int add() {
       return c++;
    }


    public int getCount() {
        return c;
    }
    
    
    @Override
    public void close() throws Exception {
        System.err.println("Счетчик закрыт");
    }
    
}
