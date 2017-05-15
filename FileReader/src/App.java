/**
 * Created by nicv on 5/13/17.
 */
import java.io.*;

public class App {
    public static void main(String[] args){

        File file = new File("test.txt");
        BufferedReader br = null;

        try {
            //opening the file
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            //better than += for memory considerations
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch(IOException e){
            System.out.println("Unable to read file: " + file.toString());
        }
        //always guarenteed to be executed
        finally{
            
        }

        //closing
        try {
            br.close();
        }catch(IOException e){
            System.out.println("Unable to close file: " + file.toString());
        }catch(NullPointerException ex){
            //File was probably never opened!
        }

    }
}
