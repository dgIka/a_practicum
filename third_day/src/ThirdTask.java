import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdTask {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double  delimoe = -1;
        double delitel = -1;
        for (int i = 0; i < 5; i++) {
            delimoe = Double.parseDouble(reader.readLine());
            delitel = Double.parseDouble(reader.readLine());
            if (delitel == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(delimoe / delitel);
        }
    }
}
