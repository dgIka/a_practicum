import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        boolean checker = false;
        int stages = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));)
            {
                while (!checker) {
                    try {
                String input = reader.readLine();
                stages = Integer.parseInt(input);
                checker = true;
            } catch (NumberFormatException nfe) {
                System.out.println("incorrect input");

                    }
                }
            }
    if (stages > 0 && stages <= 4) {
        System.out.println("Малоэтажный дом");
    } else if (stages >= 5 && stages <= 8) {
        System.out.println("Среднеэтажный дом");
    } else if (stages >= 9) {
        System.out.println("Многоэтажный дом");
    } else System.out.println("Некорретный ввод");
    }
}