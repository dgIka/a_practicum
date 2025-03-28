package Day_12.Task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand queen = new MusicBand("Queen", 1977);
        queen.addMember("Freddie mercury");
        MusicBand linkinPark = new MusicBand("Linkin Park", 1991);
        linkinPark.addMember("Chester Beninghton");
        linkinPark.addMember("Mike Shinoda");
        MusicBand.transferMembers(queen,linkinPark);
        linkinPark.printMembers();
    }
}
