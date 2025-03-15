import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdTask {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        while (max > min){
            if (max % 5 == 0 && max % 10 != 0) {
                System.out.println(max);
            }
            max--;
        }
    }
}
