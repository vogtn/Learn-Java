/**
 * Created by nicv on 5/7/17.
 */
class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is: " + name);
    }
    //void means no return
    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    //getter methods
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class App {
    public static void main(String[] args){
        Person person1 = new Person();

        person1.name = "Joe";
        person1.age = 25;

        System.out.println("Years until retirement: " + person1.calculateYearsToRetirement());

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}
