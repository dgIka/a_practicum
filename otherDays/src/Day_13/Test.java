package Day_13;

public class Test {
    public static void main(String[] args) {
        User igor = new User("Игорь");
        User ika = new User("Ираклий");
        User ann = new User("Аня");
        igor.sendMessage(ika, "Привет");
        igor.sendMessage(ika, "Как дела?");
        ika.sendMessage(igor, "Привет");
        ika.sendMessage(igor, "Нормально");
        ika.sendMessage(igor, "А у тебя?");
        ann.sendMessage(igor, "Привет");
        ann.sendMessage(igor, "чмошник");
        ann.sendMessage(igor, "как дела?");
        igor.sendMessage(ann, "Привет");
        igor.sendMessage(ann, "Да, я чмошник");
        igor.sendMessage(ann, "Дела как у чмошника");
        MessageDatabase.showDialog(igor, ann);
    }
}
