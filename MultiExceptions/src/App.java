import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by nicv on 5/13/17.
 */
public class App {
    public static void main(String[] args){
        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
        */

        //try multicatch
        /*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

        //polymorphism
        //Exception is a parent class of all child exceptions
        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //if you have a child exception child first, otherwise polymorphism wont catch
        try {
            test.input();
        }catch(FileNotFoundException e){

        }catch(IOException e){

        }
    }
}
