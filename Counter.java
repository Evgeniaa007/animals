import java.io.IOException;


public class Counter implements AutoCloseable {

    Integer c;

    public Counter() {
        c = 0;
    }

    public void add() throws IOException{
        // if (isClosed){
        //   throw new IOException("Объект уже закрыт");  
        // }
        try{
            c ++;
        }
        catch (NullPointerException e){
            throw new IOException("Объект уже закрыт");
        }
    }

    public int getCount() {
        return c;
    }

    @Override
    public void close() throws Exception {
        c = null;
    }
    
}