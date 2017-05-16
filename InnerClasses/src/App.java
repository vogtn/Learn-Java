/**
 * Created by nicv on 5/16/17.
 */
public class App {
    public static void main(String[] args){
        Robot robot = new Robot(7);
        robot.start();


        //another syntax to access it outside of class
//        Robot.Brain brain = robot.new Brain();
//        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
