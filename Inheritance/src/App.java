/**
 * Created by nicv on 5/9/17.
 */
public class App {
    public static void main(String[] args){
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        //normally car1 would have no methods
        //however extends Machine, so inherits Machine methods.
        car1.start();
        car1.wipeWindShield();
        car1.stop();
        //inherted varible from machine
        car1.getName();
    }
}
