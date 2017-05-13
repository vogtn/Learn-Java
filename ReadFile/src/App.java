/**
 * Created by nicv on 5/12/17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/nicv/IdeaProjects/ReadFile/file.txt";

        File textfile = new File(fileName);

        Scanner in = new Scanner(textfile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        int count = 2;
        //will print extra new line unless
        in.nextLine();

        while(in.hasNextLine()){
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
        }

        in.close();
    }
}
