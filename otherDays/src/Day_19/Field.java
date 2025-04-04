package Day_19;

public class Field {
    String[][] field;

    public Field() {
        this.field = new String[10][10];
    }
    public void fillNewField () {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.field[i][j] = Cell.EMPTY;
            }
        }
    }

    public String[][] getField() {
        return field;
    }

    public void setField(String[][] field) {
        this.field = field;
    }
    public void printField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.field[i][j]);
            }
            System.out.println("");
        }
    }
}
