/**
 * Created by nicv on 5/9/17.
 */

class Thing{
    //final means constant
    public final static int LUCKY_NUMBER = 7;
    //instance variables belong to each instance
    public String name;

    public static int count = 0;

    public int id;

    public Thing() {
        //each object will  have its own id each time the constructor is run
        id = count;
        count++;
    }

    //static variables belong do the class, therefore do not recieve a new one for each instance
    public static String description;

    public void showName() {
        //can access static and instance variables
        System.out.println("Object id:" + id +  " " + description + ": " + name);
    }
    public static void showInfo(){
        //can return static variables (description) but not instance variables (name)
        System.out.println(description);
    }

}
public class App {
    public static void main(String[] args){

        Thing.description = "I am a thing";
        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "bob";
        thing2.name = "sue";

        System.out.println("After creating objects, count is: " + Thing.count);


        thing1.showName();
        thing2.showName();

        //static PI is uppercase since it is a constant
        System.out.println(Math.PI);

        //final is constant, therefore lucky number cant be changed
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
