/**
 * Created by nicv on 5/7/17.
 */

class Person{
    String name;
    int age;

    //method (subroutine)
    void speak(){
        for(int i =0; i <3; i++){
            System.out.println("My name is: " + name + " and I am " + age + " years old");
        }
    }
    void sayHello(){
        System.out.println("Hello there!");
    }
}
public class App {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Joe bloggs";
        person1.age = 21;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "sarah smith";
        person2.age = 45;
        person2.speak();

    }
}
