import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double  delimoe = -1;
        double delitel = -1;
        while (delitel != 0) {
            delimoe = Double.parseDouble(reader.readLine());
            delitel = Double.parseDouble(reader.readLine());
            System.out.println(delimoe / delitel);
        }
    }
}
