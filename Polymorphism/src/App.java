/**
 * Created by nicv on 5/12/17.
 */
public class App {
    public static void main(String[] args){
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        //Plant plant2 = plant1;
        //can also do
        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();
        //plant2.shedLeaves(); <- doesnt work'

        //parent class expected, but tree works because polymorphism allows child class
        doGrow(tree);
    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
