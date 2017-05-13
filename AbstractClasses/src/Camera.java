/**
 * Created by nicv on 5/13/17.
 */
public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("starting Camera");
    }

    @Override
    public void doStuff() {
        System.out.println("Camera doingstuff");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down Camera");
    }
}
