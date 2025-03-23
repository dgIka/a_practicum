public class SecondTask {
    public static void main(String[] args) {
        Player player = new Player();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player.info();
    }

}
class Player {
    private int stamina;
    public final static int MAX_STAMINA = Integer.MAX_VALUE;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player() {
        this.stamina = (int) (Math.random() * 10 + 90 );
        if (countPlayers < 9) {
            countPlayers++;
        }
    }
    public void run() {
        if (countPlayers > 0) {
            System.out.println("Игрок бежит.");
            this.stamina--;
        } else System.out.println("Игрок устал");
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (9 - countPlayers) + " мест.");
        } else System.out.println("На поле нет свободных мест.");
    }

    public int getStamina() {
        return stamina;
    }
}
