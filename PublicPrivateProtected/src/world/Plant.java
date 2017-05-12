package world;

/**
 * Created by nicv on 5/9/17.
 */
public class Plant {
    //bad practice
    public String name;

    //acceptable since its final
    public final static int ID = 8;

    //only access within this class
    private String type;
    //accecible within class, subclass, or same package
    protected String size;

    //package level visibility
    int height;

    public Plant(){
        this.name = "Freddy";
        this.type = "plant";
        this.size = "large";
        this.height = 8;
    }
}
