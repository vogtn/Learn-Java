/**
 * Created by nicv on 5/9/17.
 */
public class App {
    public static void main(String[] args){

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        //ok since machine implements info
        Info info1 = new Machine();
        info1.showInfo();

        //point info2 to the same thing that person1 points to
        Info info2 = person1;
        info2.showInfo();

        outputInfo(mach1);
        outputInfo(person1);
    }
    private static void outputInfo(Info info){
        info.showInfo();
    }
}
