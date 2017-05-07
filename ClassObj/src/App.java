/**
 * Created by nicv on 5/7/17.
 */

//non-public class
class Person{
    //Classes can contain, data, subroutines(methods)

    //Instance variables (data or state)
    String name;
    int age;
}

public class App {
    //subroutine(method), starts where you call main
    public static void main(String[] args){
        Person person1 = new Person();

        person1.name = "Joe Bloggs";
        person1.age = 37;

        //type variable = new Person Object();
        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
        System.out.println(person2.age);
    }
}
