/**
 * Created by nicv on 5/5/17.
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /*
            Just asks, but has repetitive code:

        System.out.println("Enter a number: ");
        int value = scanner.nextInt();

        //keep asking user until value is 5
        while(value != 5) {

            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        System.out.println("Got 5!");
        */

        //with no repetition

        int value;

        do{
            System.out.println("Enter a number");
            value = scanner.nextInt();
        }
        while( value != 5 );
        System.out.println("Got 5!");

    }
}
