/**
 * Created by nicv on 5/5/17.
 */
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();


        //should only use text or integers for switch
        switch(text){
            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine stopped.");
                break;

            default:
                System.out.println("Command not recognized");
        }
    }
}
