/**
 * Created by nicv on 5/5/17.
 */
public class Application {
    public static void main(String[] args){
        int myInt = 7;

        //uppercase S, because not primitive type, but class
        String text = "Hello";

        String blank = " ";

        String name = "Bob";

        String greeting = text + blank + name;

        System.out.println(greeting);

        //concatenation
        System.out.println("Hello" + " " + "Bob");

        System.out.println("My integer is: " + myInt);

        double myDouble = 7.8;

        System.out.println("My number is: " + myDouble + ".");
    }
}
