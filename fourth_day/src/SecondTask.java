public class SecondTask {
    public static void main(String[] args) throws Exception{
        int[] abc = new int[100];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int zeroSum = 0;
        int zeroCount = 0;
        for (int i = 0; i < 100; i++) {
            abc[i] = (int) (Math.random() * 1000);
        }
        for (int a: abc) {
            if (a % 10 == 0) {
                zeroSum += a;
                zeroCount++;
            }
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Наибольший элемент массива " + max);
        System.out.println("Наименьший элемент массива " + min);
        System.out.println("Количестве элементов массива, оканчивающихся на 0 " + zeroCount);
        System.out.println("Сумма элементов массива, оканчивающихся на 0 " + zeroSum);
    }
}
