package Day_18;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        System.out.println(recursionSum(numbers, numbers.length - 1));
    }
    public static int recursionSum (int[] numbers, int id) {
        if (id < 0 ) return 0;
        return numbers[id] + recursionSum(numbers, id - 1);
    }
}
