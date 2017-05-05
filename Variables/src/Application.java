/**
 * Created by nicv on 5/5/17.
 */
public class Application {
    public static void main(String[] args){
        int myNumber = 88;

        //hold up to ~32,000
        short myShort = 847;

        //64 bit value large numbers
        long myLong = 9797;

        //decimals
        double myDouble = 7.3243;

        //short version of double, must contain "f" othewise its evaluated as a double
        float myFloat = 324.3f;

        //unicode character
        char myChar = 'y';

        //boolean
        boolean myBoolean = true;

        // min value -128, max value 128: useful for saving memory in large arrays
        byte myByte = 127;


        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
    }
}
