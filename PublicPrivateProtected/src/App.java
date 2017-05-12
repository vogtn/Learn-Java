import world.Plant;

/**
 * Created by nicv on 5/9/17.
 */
public class App {
    public static void main(String[] args){
        Plant plant = new Plant();

        //System.out.println(plant.type)
        //doesnt work because type is private

        //System.out.println(plant.size);
        //doesnt work because size is protected and not in the same package

        //System.out.println(plant.height);
        //wont work because App and Plant are in different packages
        //height is package level visibility
    }
}
