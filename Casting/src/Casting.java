/**
 * Created by nicv on 5/12/17.
 */
public class Casting {
    public static void main(String[] args){

        byte byteValue = 20;
        //16 bit so less memory than int
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        //f required otherwise reads as a double
        float floatValue = 888.33f;
        float floatValue2 = (float)99.3;

        double doubleValue = 32.5;

        System.out.println(Byte.MAX_VALUE);
        //returns max value of the type

        //casting long value to int
        intValue = (int)longValue;

        doubleValue = intValue;
        System.out.println(doubleValue);
        //returns 23555.0, so doesnt necessarly need casting

        //cast to chop off decimal value, no rounding
        intValue = (int)floatValue;

        byteValue = (byte)128;
        //returns -128
        //128 is too big for a byte
    }
}
