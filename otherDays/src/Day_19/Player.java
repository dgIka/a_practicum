package Day_19;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    Field field;
    Field attackField;
    private int fourDeck = 0;
    private int threeDeck = 0;
    private int twoDeck = 0;
    private int oneDeck = 0;
    private int ships = 0;


    public Player() {
        this.field = new Field();
        this.attackField = new Field();
        this.field.fillNewField();
    }

    public boolean attack(Player target, BufferedReader reader) throws IOException {
        String[][] tempAttackField = this.getAttackField().getField();
        System.out.println("Атака. Введите X: ");
        int tempX = Integer.parseInt(reader.readLine());
        System.out.println("Атака. Введите Y: ");
        int tempY = Integer.parseInt(reader.readLine());
                if (target.getField().getField()[tempX][tempY].equals(Cell.SHIP)) {
                    System.out.println("Попал");
                    tempAttackField[tempX][tempY] = Cell.HIT;
                    return true;
                } else {
                    System.out.println("Промах");
                    tempAttackField[tempX][tempY] = Cell.MISS;
                    return false;
                }


    }

    public Field getField() {
        return this.field;
    }

    public void setField(String[][] field) {
        this.field.setField(field);
    }

    public int getFourDeck() {
        return fourDeck;
    }

    public int getThreeDeck() {
        return threeDeck;
    }

    public int getTwoDeck() {
        return twoDeck;
    }

    public int getOneDeck() {
        return oneDeck;
    }

    public int getShips() {
        return ships;
    }

    public void setFourDeck(int fourDeck) {
        this.fourDeck = fourDeck;
    }

    public void setThreeDeck(int threeDeck) {
        this.threeDeck = threeDeck;
    }

    public void setTwoDeck(int twoDeck) {
        this.twoDeck = twoDeck;
    }

    public void setOneDeck(int oneDeck) {
        this.oneDeck = oneDeck;
    }

    public void setShips(int ships) {
        this.ships = ships;
    }

    public Field getAttackField() {
        return attackField;
    }

    public void setAttackField(Field attackField) {
        this.attackField = attackField;
    }
}
