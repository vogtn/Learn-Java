package world;

/**
 * Created by nicv on 5/12/17.
 */
public class Field {
    private Plant plant = new Plant();

    public Field(){
        //size is protected, but in the same package
        System.out.println(plant.size);
    }
}
