
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        while (counter != 10) {
            counter++;
            System.out.print("JAVA ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.println("JAVA");
        }

        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }

        for (int i = 1980; i <= 2020; i+= 4) {
            System.out.println("Олимпиада " + i + " года");
        }

        int k = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }

    }
}