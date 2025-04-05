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
                            tempField[neighborX][neighborY] = Cell.OREOL;
                        }
                    }
                }

                System.out.println("Однопалубный корабль создан.");
                player.setField(tempField);
                break;
            } else System.out.println("Здесь создавать корабль нельзя.");
        }

    }

    public static void multipleDeck (Player player, BufferedReader reader, int countDeck) throws IOException {
        String[][] tempField = player.getField().getField();
        int[] cX = new int[countDeck];
        int[] cY = new int[countDeck];
        if (countDeck == 2) {
            System.out.println("Введите координаты для двухпаллубного корабля");
        }
        if (countDeck == 3) {
            System.out.println("Введите координаты для трехпаллубного корабля");
        }
        if (countDeck == 4) {
            System.out.println("Введите координаты для четырехпаллубного корабля");
        }
        for (int f = 0; f < countDeck; f++) {
            if (f == 0) {
                    System.out.println("Палуба " + (f + 1));
                }
                System.out.println("Сначала X");
                int tempX = Integer.parseInt(reader.readLine());
                System.out.println("Теперь Y");
                int tempY = Integer.parseInt(reader.readLine());
                addDeck(tempField, tempX, tempY);
                cX[f] = tempX;
                cY[f] = tempY;

        }
        addOreols(tempField, cX, cY);
        //проверить работу создания ореолов, добавить в метод с ореолами добавление координат ореолов в поле
        //переделать методы из void может быть...
        //добавить добавление следующих палуб
        player.setField(tempField);

    }
    private static void addDeck (String[][] field, int x, int y) { //вспомогательный метод для добавления 1 палубы и помметки соседей
        while (true) {
            if (field[x][y].equals(Cell.EMPTY)) {
                field[x][y] = Cell.SHIP;
                 break;
            } else System.out.println("Здесь создавать корабль нельзя.");
        }
    }
    private static void addOreols (String[][] field, int[] x, int[] y){
        for (int k = 0; k < x.length; k++) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int neighborX = x[k] + i;
                    int neighborY = y[k] + j;
                    if (neighborX >= 0 && neighborX < field.length &&
                            neighborY >= 0 && neighborY < field[0].length && !(i == 0 & j == 0) && !field[neighborX][neighborY].equals(Cell.SHIP)) {
                        field[neighborX][neighborY] = Cell.OREOL;

                    }
                }

            }
        }
    }
}
