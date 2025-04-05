package Day_19;

public class Player {
    Field field;

    public Player() {
        this.field = new Field();
        this.field.fillNewField();
    }

    public Field getField() {
        return this.field;
    }

    public void setField(String[][] field) {
        this.field.setField(field);
    }
}
