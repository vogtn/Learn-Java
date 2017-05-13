/**
 * Created by nicv on 5/13/17.
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class App {
    public static void main(String[] args){

        File file = new File("test.txt");

        try {
            FileReader fr  = new FileReader(file);
            //this will not be read, if exception is thrown
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        //this will be shown no matter what
        System.out.println("Finished");
    }
}
