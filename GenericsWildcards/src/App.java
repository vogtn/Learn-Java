/**
 * Created by nicv on 5/12/17.
 */
import java.util.ArrayList;

class Machine{
    @Override
    public String toString() {
        return "I am a Machine";
    }
    public void start(){
        System.out.println("Machine starting");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a Camera";
    }
    public void snap(){
        System.out.println("snap");
    }
}

public class App {
    public static void main(String[] args){

        ArrayList<Machine> list1 = new ArrayList<Machine>();

        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());


        showList(list2);
        //ArrayList cannot handle the same parent of any child class type
        //? <- wild card parameter

    }
    public static void showList(ArrayList<? extends Machine> list){
        for(Machine value: list){
            System.out.println(value);
            value.start();
        }
    }
}
