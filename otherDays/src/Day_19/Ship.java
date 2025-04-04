package Day_19;

import java.io.BufferedReader;
import java.io.IOException;

public class Ship {
    private String coordinates;
    public static void oneDeck (Player player, BufferedReader reader) throws IOException {
        String[][] tempField = player.getField().getField();
        System.out.println("Введите координаты для однопалубного корябля");
        while (true) {
            System.out.println("Сначала X");
            int tempX = Integer.parseInt(reader.readLine());
            System.out.println("Теперь Y");
            int tempY = Integer.parseInt(reader.readLine());
            if (tempField[tempX][tempY].equals(Cell.EMPTY)) {
                tempField[tempX][tempY] = Cell.SHIP;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int neighborX = tempX + i;
                        int neighborY = tempY + j;
                        if (neighborX >= 0 && neighborX < tempField.length &&
                        neighborY >= 0 && neighborY < tempField[0].length && !(i == 0 & j == 0)) {
                            tempField[tempX][tempY] = Cell.OREOL;
                        }
                    }
                }

                System.out.println("Однопалубный корабль создан.");
                break;
            } else System.out.println("Здесь создавать корабль нельзя.");
        }

    }
}
