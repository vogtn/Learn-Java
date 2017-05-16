/**
 * Created by nicv on 5/16/17.
 */
public class App {

    public static void main(String[] args){
        //Enum constants arent strings, but Objects


        Animal animal = Animal.DOG;

        switch(animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
        }

        System.out.println(Animal.DOG);
        //DOG
        System.out.println("Enum name as a string: "+ Animal.DOG.name());
        //Enum name as a string: DOG
        System.out.println(Animal.DOG.getClass());
        //class Animal
        System.out.println(Animal.DOG instanceof Enum);
        //true


        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(animal2);
        //This animal is called: Fergus

    }
}
