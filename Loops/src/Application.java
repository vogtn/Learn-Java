/**
 * Created by nicv on 5/5/17.
 */
public class Application {
    public static void main(String[] args){
        /* boolean loop = 4 < 5;
            System.out.println(loop)
                => returns true */

        //while loop

        int value = 0;

        while(value < 10)
        {
            System.out.println("Hello " + value);

            //store value + 1
            value = value + 1;
        }

        //for loop
        System.out.println("While loop");

        for(int i=0; i<5; i++)
        {
            //%d print this string, but using the value of the integer
            //\n is a new line escape character
            System.out.printf("The value of i is: %d\n", i);
        }


    }
}
