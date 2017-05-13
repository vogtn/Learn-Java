/**
 * Created by nicv on 5/12/17.
 */
import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class App {
    public static void main(String[] args){

        ///////////// Before Java 5 /////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("bananna");
        list.add("orange");

        //downcast object
        String fruit = (String)list.get(1);

        System.out.println(fruit);

        ////////////// Generics ////////////////

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("aligator");

        String animal = strings.get(1);

        System.out.println(animal);


        /////////////// There can be more than one type of argument ///////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ////////////// Java 7,8 ////////////////

        ArrayList<Animal> someList = new ArrayList<>();

    }
}
