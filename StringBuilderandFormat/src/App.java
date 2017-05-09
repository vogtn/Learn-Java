/**
 * Created by nicv on 5/9/17.
 */
public class App {
    public static void main(String[] args){

        //inefficient
        String info = "";

        info += "My Name is Bob.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My Name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer");

        System.out.println(sb.toString());

        //less code

        StringBuilder s = new StringBuilder();

        s.append("My name is roger")
                .append(" ")
                .append("I am a sky diver");

        System.out.println(s.toString());

        //multi-threaded typically use StringBuffer rather than StringBuilder

        //// Formatting ///////////////////////

        System.out.print("Here is some text. \tThat was a tab.\nThis is a newline.");
        System.out.print("This will be on the same line.");

        //embbed special format characters (format string)
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
        //%-10d formats 10 characters to the left

        //aligns numbers (once it hits 10)
        for(int i=0; i<20; i++){
            System.out.printf("%2d: %s\n", i, "Here is some text");
        }

        //floating point formatter
        //rounds + specify amount of decimal places
        System.out.printf("Total value: %.2f\n", 5.6968);
        System.out.printf("Total value: %2.1f\n", 272.2399);
    }
}
