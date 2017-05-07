/**
 * Created by nicv on 5/7/17.
 */
class Robot {
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class App {
    public static void main(String[] args){
        Robot sam = new Robot();
        sam.speak("Hi I am sam.");
        sam.jump(7);
        sam.move("left", 14);

        String greeting = "hello there";

        sam.speak(greeting);
    }
}
