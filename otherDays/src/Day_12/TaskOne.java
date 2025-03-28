package Day_12;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        List<Auto> list = new ArrayList<>();
        list.add(new Auto("Audi"));
        list.add(new Auto("BMW"));
        list.add(new Auto("Mercedes"));
        list.add(new Auto("Toyota"));
        list.add(new Auto("Subaru"));
        System.out.println(list);
        list.add(list.size()/2, new Auto("Lexus"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

}
class Auto {
    private String name;

    public Auto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
