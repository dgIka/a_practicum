package Day_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("Tak16_1.txt");
        Path path2 = Path.of("Tak16_2.txt");
        List<String> file1 = new ArrayList<>();
        int counter = 0;
        int tempSum = 0;

        if (!Files.exists(path1)) {
            Files.createFile(path1);
        }
        if (!Files.exists(path2)) {
            Files.createFile(path2);
        }
        for (int i = 0; i < 1000; i++) {
            file1.add(String.valueOf((int)(Math.random() * 100)));
        }
        Files.write(path1, file1);
        List<String> tempFile = Files.readAllLines(path1);
        List<String> file2 = new ArrayList<>();
        for (String a: tempFile) {
            tempSum += Integer.parseInt(a);
            counter++;
            if (counter == 20) {
                counter = 0;
                file2.add(String.valueOf((double)tempSum/20));
                tempSum = 0;
            }
        }
        Files.write(path2, file2);


    }
}
