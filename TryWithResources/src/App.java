/**
 * Created by nicv on 5/14/17.
 */
class Temp implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class App {
    //Resources are a java 7 feature
    public static void main(String[] args){

        //try with resources
        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
