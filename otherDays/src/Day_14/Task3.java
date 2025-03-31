package Day_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src\\Day_14\\test2.txt");
        List<Human> result = parseFileToStringList(path);
        System.out.println(result);

    }
    public static List<Human> parseFileToStringList(Path path) throws IOException {
        List<Human> humans = new ArrayList<>();
        List<String> list = new ArrayList<>();

        if (Files.exists(path)) {
            list = Files.readAllLines(path);
        }
        for (String a: list) {
            String[] temp = a.split(" ");
            humans.add(new Human(temp[0], Integer.parseInt(temp[1])));
        }
        return humans;
    }
}
class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + this.getName() + " Возраст: " + this.getAge();
    }
}
