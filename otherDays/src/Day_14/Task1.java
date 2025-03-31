package Day_14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Текущая рабочая директория: " + System.getProperty("user.dir"));
        List<String> numbers = Files.readAllLines(Paths.get("src\\Day_14\\test.txt"));
        int sum = 0;
        for (String a: numbers) {
            sum += Integer.parseInt(a);
            System.out.println(a);
        }
        System.out.println(sum);




    }
}
