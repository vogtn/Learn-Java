import java.io.*;

/**
 * Created by nicv on 5/15/17.
 */
public class App {
    public static void main(String[] args){
        File file = new File("test.txt");
        //no need to close, handled already by try with resources
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            String line;
            br.write("This is line one");
            br.newLine();
            br.write("this is line two");
            br.newLine();
            br.write("Last line.");

        }catch(IOException e){
            System.out.println("Unable to read file " + file.toString());
        }
    }
}
