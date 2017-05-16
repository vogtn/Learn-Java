/**
 * Created by nicv on 5/16/17.
 */
public class App {
    public static void main(String[] args){

        //E.g. 4! = 4*3*2*1 (factorial of 4)
        System.out.println(calculate(4));

    }

    private static int calculate(int value){

        if(value == 1){
            return 1;
        }
        return calculate(value-1) * value;

    }
}
