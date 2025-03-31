package Day_14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src\\Day_14\\test2.txt");
        List<String> result = parseFileToStringList(path);
        System.out.println(result);

    }
    public static List<String> parseFileToStringList(Path path) throws IOException {
        List<String> list = new ArrayList<>();
        if (Files.exists(path)) {
            list = Files.readAllLines(path);

        }
        return list;
    }
}
