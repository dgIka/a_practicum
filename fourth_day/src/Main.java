import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] abc = new int[Integer.parseInt(reader.readLine())];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (int) (Math.random() * 10);
        }
        int eightCounter = 0;
        int one = 0;
        int chetnie = 0;
        int nechetnie = 0;
        int sum = 0;
        for (Integer a: abc) {
            System.out.print(a + " ");
            if (a > 8) {
                eightCounter++;
            }
            if (a == 1) {
                one++;
            }
            if (a % 2 == 0) {
                chetnie++;
            } else nechetnie++;
            sum += a;
        }
        System.out.println("");
        System.out.println("Длина массива: " + abc.length);
        System.out.println("Количество чисел больше 8: " + eightCounter);
        System.out.println("Количестве чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + chetnie);
        System.out.println("Количество нечетных чисел: " + nechetnie);

    }
}