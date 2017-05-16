/**
 * Created by nicv on 5/15/17.
 */
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //implementing IDE equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}


public class App {
    public static void main(String[] args){

        System.out.println(new Object());
        //prints hashcode unique ID

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");

        //if person1 = person2, then it will return true, because you are pointing there

        System.out.println(person1.equals(person2));


        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2);
        //false

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1 == number2);
        //safer
        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hellofdafd".substring(0,5);
        //java optimizes references to exact object
        System.out.println(text1 == text2);

        //dont compare non primative numbers with ==
        //always use .equals for strings
        System.out.println(text1.equals(text2));
        //returns true

    }
}
