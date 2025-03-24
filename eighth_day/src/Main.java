
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        String test = "0";
//        for (int i = 1; i < 20000 ; i++) {
//            test += " " + i;
//        }
//        System.out.println(test);



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
          sb.append(" " + i);
        }
        System.out.println(sb);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "мс");


    }
}