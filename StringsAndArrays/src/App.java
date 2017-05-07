/**
 * Created by nicv on 5/6/17.
 */
public class App {
    public static void main(String[] args){
        String[] words = new String[3];
        //allocating enough memory for 3 strings

        words[0] = "hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);
        //prints "you"

        //other method

        String[] fruits = {"apple", "bananna", "pear", "kiwi"};

        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        //or
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
