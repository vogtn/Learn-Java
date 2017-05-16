import java.io.Serializable;

/**
 * Created by nicv on 5/16/17.
 */
public class Person implements Serializable {

    private int id;
    private String name;

    public Person(int id, String name){
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
}
