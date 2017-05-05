/**
 * Created by nicv on 5/5/17.
 */
public class Application {
    public static void main(String[] args){

        // true boolean cond = 1 < 6;
        //false boolean cond =  5 != 5;

        int myInt = 20;

        //standard if

        if(4 == 4){
            System.out.println("Yes, its true");
        }
        if(5 != 5){
            System.out.println("yes its true");
        }

        //else if, will only run the first condition that is true

        if(myInt < 30){
            System.out.println("Yes its true!");
        }
        else if(myInt == 90)
        {
            System.out.println("Its 90!");
        }
        else{
            System.out.println("No its false");
        }

        //break statements
        int loop = 0;
        while(true){
            System.out.println("Looping: " + loop);
            if(loop == 5){
                break;
            }
            loop++;
        }

    }
}
