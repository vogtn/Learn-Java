package world;

/**
 * Created by nicv on 5/9/17.
 */
public class Oak extends Plant {
    public Oak(){
        //type is private therefore this wont work.
        //type = "tree";

        //works
        this.size = "large";
        //no access specifier; works because Oak is in the same package
        this.height = 10;
    }

    /**
     * Created by nicv on 5/12/17.
     */
    public static class Grass extends Plant {

    }
}
