import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[][] abc = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                abc[i][j] = (int) (Math.random() * 10000);
            }
        }
        int max = 0;
        int maxTemp = 0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            maxTemp = 0;
            for (int j = 0; j < 8; j++) {

                maxTemp += abc[i][j];
            }
            if(maxTemp > max) {
                max = maxTemp;
                index = i;

            }
        }
        for (int[] a: abc) {
            System.out.print(Arrays.toString(a));
            int localSum = 0;
            for (int i = 0; i < a.length; i++) {
                localSum += a[i];
            }
            System.out.println(" " + localSum);
        }
        System.out.println(index);
    }

}
