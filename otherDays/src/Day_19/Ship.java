package Day_19;

import java.io.BufferedReader;
import java.io.IOException;

public class Ship {
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
            System.out.println("Палуба " + (f + 1));
            System.out.println("Введите X");
            int tempX = Integer.parseInt(reader.readLine());
            System.out.println("Введите Y");
            int tempY = Integer.parseInt(reader.readLine());
            if(checkCell(tempField, tempX, tempY)) {
                cX[f] = tempX;
                cY[f] = tempY;
//                tempField[tempX][tempY] = Cell.SHIP;
            } else {
                System.out.println("Клетка недоступна. Введите другие координаты.");
                f--;
                continue;
            }

        }
        if(isShipValid(cX, cY)) {
            for (int i = 0; i < cX.length; i++) {
                tempField[cX[i]][cY[i]] = Cell.SHIP;
            }
            addOreols(tempField, cX, cY);
            player.setField(tempField);
            if (countDeck == 4) player.setFourDeck(player.getFourDeck() + 1);
            else if (countDeck == 3) {
                player.setThreeDeck(player.getThreeDeck() + 1);
            } else if (countDeck == 2) {
                player.setTwoDeck(player.getTwoDeck() + 1);
            } else {player.setOneDeck(player.getOneDeck() + 1);}
            player.setShips(player.getShips() + countDeck);

        } else System.out.println("Такой корабль создать нельзя");

        //Добавить цикл проверки соседних палуб


    }
    private static boolean checkCell (String[][] field, int x, int y) {
            if (field[x][y].equals(Cell.EMPTY)) {
                return true;
            } else return false;

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
    private static boolean isShipValid(int[] x, int[] y) { //проверка валидности формы кораблей
        if (x.length != y.length) return false;
        if (x.length == 1) return true;
        boolean isHorizontal = isLine(y);
        boolean isVertical = isLine(x);
        if (!isVertical && !isHorizontal) {
            return false;
        }
        if (isHorizontal) {
            for (int i = 1; i < x.length; i++) {
                if (Math.abs(x[i] - x[i - 1]) != 1) return false; // Проверка соседства по X
            }
        } else {
            for (int i = 1; i < y.length; i++) {
                if (Math.abs(y[i] - y[i - 1]) != 1) return false; // Проверка соседства по Y
            }
        }
        return true;
    }

    private static boolean isLine(int[] length) { //проверка лежат ли на одной линии
        for (int i = 1; i < length.length; i++) {
            if (length[i] != length[0] ) {
                return false;
            }
        }
        return true;
    }
}
