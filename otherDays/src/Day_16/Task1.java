package Day_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src\\Day_14\\test.txt");
        printResult(path);

    }
    public static void printResult(Path path) throws IOException {
        List<String> file = Files.readAllLines(path);
        int counter = 0;
        int sum = 0;

        for (String a: file) {
            sum += Integer.parseInt(a);
            counter++;
        }
        System.out.println((double) sum/counter);
        System.out.println(String.format("%.3f", ((double) sum/counter)));
    }
}
