/**
 * Created by nicv on 5/5/17.
 */
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

//        //create scanner object
//        Scanner input = new Scanner(System.in);
//        //prompt
//        System.out.println("Enter a line of text: ");
//
//
//        //wait for the user input
//        String line = input.nextLine();
//        /*
//        or:
//        int value = input.nextInt();
//        or:
//        double value = input.nextDouble();
//         */
//
//
//        //tell them what they entered
//        System.out.println("You entered: " + line);

        //create if statement based on scanned value

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any value (text, num, or decimal): ");

        if(input.hasNextInt()){
            System.out.println("You entered an Integer");
        }else if(input.hasNextDouble()){
            System.out.println("You entered a decimal!");
        }else{
            System.out.println("You entered Text!");
        }
    }
}
