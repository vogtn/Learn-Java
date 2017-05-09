/**
 * Created by nicv on 5/9/17.
 */
public class Car extends Machine {
    //Car is a child class of Machine
    public void getName(){
        System.out.println(openName);
    }
    public void start(){
        System.out.println("Car started");
    }
    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }
}
