package Day_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Player player1 = new Player();
        player1.getField().printField();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Ship.oneDeck(player1, reader);
        player1.getField().printField();
        Ship.oneDeck(player1, reader);
        player1.getField().printField();
        Ship.oneDeck(player1, reader);
        player1.getField().printField();
    }
}
