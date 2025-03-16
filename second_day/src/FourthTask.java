import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double y;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        } else y = 420;
        System.out.println(y);
    }
    }
