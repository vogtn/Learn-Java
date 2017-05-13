/**
 * Created by nicv on 5/13/17.
 */
public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("starting Car");
    }

    @Override
    public void doStuff() {
        System.out.println("Car doing stuff");
    }

    @Override
    public void shutdown() {
        System.out.println("Car shutting down");
    }
}
