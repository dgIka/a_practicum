package Day_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Game {
    public void startGame() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player();
        Player player2 = new Player();
        player1.getField().printField();
        System.out.println("Первый игрок создает корабли");
        while (player1.getFourDeck() < 1) {
            Ship.multipleDeck(player1, reader, 4);
            player1.getField().printField();
        }
//        while (player1.getThreeDeck() < 2) {
//            Ship.multipleDeck(player1, reader, 3);
//            player1.getField().printField();
//        }
//        while (player1.getTwoDeck() < 3) {
//            Ship.multipleDeck(player1, reader, 2);
//            player1.getField().printField();
//        }
//        while (player1.getOneDeck() < 4) {
//            Ship.multipleDeck(player1, reader, 1);
//            player1.getField().printField();
//        }
        System.out.println("");
        player2.getField().printField();
        System.out.println("Второй игрок создает корабли");
        while (player2.getFourDeck() < 1) {
            Ship.multipleDeck(player2, reader, 4);
            player2.getField().printField();
        }
//        while (player2.getThreeDeck() < 2) {
//            Ship.multipleDeck(player2, reader, 3);
//            player2.getField().printField();
//        }
//        while (player2.getTwoDeck() < 3) {
//            Ship.multipleDeck(player2, reader, 2);
//            player2.getField().printField();
//        }
//        while (player2.getOneDeck() < 4) {
//            Ship.multipleDeck(player2, reader, 1);
//            player2.getField().printField();
//        }
        System.out.println("Игра начинается");
        while (!(player2.getShips() == 0) || !(player1.getShips() == 0)) {
            player1.attack(player2, reader);
            player1.getAttackField().printField();
        }

    }
}
