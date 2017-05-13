package demo2;

/**
 * Created by nicv on 5/13/17.
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class App {
    public static void main(String[] args){
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
        }
    }
    public static void openFile() throws FileNotFoundException {
        File file = new File("Test.txt");
        FileReader fr = new FileReader(file);
    }
}