/**
 * Created by nicv on 5/13/17.
 */
public class App {
    public static void main(String[] args){

        //Runtime exception - basic fundamental errors
        int value = 7;
        value = value/0;

        //Checked
        String text;
        System.out.println(text.length());

        //handle out of bounds
        String[] texts = {"one", "two", "three"};

        try {
            System.out.println(texts[3]);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

    }
}
