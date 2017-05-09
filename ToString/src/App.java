/**
 * Created by nicv on 5/9/17.
 */

class Frog {
    //if no tostring method is defined you will recieve classname@hashcode
    public String name;
    private int id;

    public Frog(String name, int id){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        //removes inefficiency of creating a new string every time

        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id)
        .append(": ")
                .append(name);
        return sb.toString();
        */

        return String.format("%-4d: %s", id, name);
    }
}
public class App {
    public static void main(String[] args){
        Frog frog1 = new Frog("freddy", 7);
        Frog frog2 = new Frog("roger", 2);

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
