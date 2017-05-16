/**
 * Created by nicv on 5/16/17.
 */
public class Robot {

    private int id;

    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    public static class Battery {
        public void charge(){
            //cannot use ID in here unless id is static
            System.out.println("Battery charging....");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        //can only refer to local data that is final

        final String name = "Robert";

        //temp is scoped to start

        class Temp {
            public void doSomething(){
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
