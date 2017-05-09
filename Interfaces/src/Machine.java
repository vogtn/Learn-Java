/**
 * Created by nicv on 5/9/17.
 */
public class Machine implements Info {
    private int id = 7;
    public void start(){
        System.out.println("Machine started");
    }

    //forces you to have all the methods specified in the interface
    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
