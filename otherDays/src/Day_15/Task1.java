package Day_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("shoes.csv");
        List<String> fileList = Files.readAllLines(path);
        List<String> newFile = new ArrayList<>();
        Path newPath = Path.of("shoes.txt");
        String splitter = ";";

        List<String[]> shoes = new ArrayList<>();
        for (String a: fileList) {
            shoes.add(a.split(splitter));
        }
        System.out.println(shoes.get(1)[0]);
        System.out.println(shoes.get(1)[1]);
        System.out.println(shoes.get(1)[2]);
        for (String[] a: shoes) {
            if (Integer.parseInt(a[2]) == 0) {
                newFile.add(a[0] + splitter + a[1] + splitter + a[2] + "\n");
            }
        }
        Files.write(newPath, newFile);

    }
}


