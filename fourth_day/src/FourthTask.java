public class FourthTask {
    public static void main(String[] args) {
        int[] abc = new int[100];
        for (int i = 0; i < 100; i++) {
            abc[i] = (int) (Math.random() * 10000);
        }
        int max = 0;
        int temp = 0;
        int index = 0;
        for (int i = 1; i < abc.length - 1; i++) {
            temp = abc[i - 1] + abc[i] + abc[i + 1];
            if (temp > max) {
                max = temp;
                temp = 0;
                index = i - 1;
            }
        }
        for (int a: abc) {
            System.out.print(a + " ");
        }
        System.out.println("");
        System.out.println(max);
        System.out.println(index);
    }
}
