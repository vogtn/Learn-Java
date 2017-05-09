/**
 * Created by nicv on 5/9/17.
 */
public class Machine {
    //private is only accessible within this class even if inherited
    private String name = "Machine Type 1";
    //accesible from any within the package
    protected String openName = "Machine Type 2";

    public void start(){
        System.out.println("Machine started");
    }
    public void stop(){
        System.out.println("Machine stopped");
    }
}
