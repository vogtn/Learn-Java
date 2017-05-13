/**
 * Created by nicv on 5/13/17.
 */
public class App {
    public static void main(String[] args){
        Camera cam1 = new Camera();
        cam1.setId(5);
        cam1.run();

        Car car1 = new Car();
        car1.setId(4);
        car1.run();
        //why have a new machine, Machine is more of a base class.
        //abstract doesnt allow you to create new machine

        //camera and car ARE machines

        //different than an interface


    }
}
