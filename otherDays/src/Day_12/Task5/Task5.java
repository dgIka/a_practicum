package Day_12.Task5;

import Day_12.Task5.MusicBand;

public class Task5 {
    public static void main(String[] args) {
        MusicBand queen = new MusicBand("Queen", 1977);
        queen.addMember(new MusicArtist("Freddie mercury", 1951));
        MusicBand linkinPark = new MusicBand("Linkin Park", 1991);
        linkinPark.addMember(new MusicArtist("Chester Beninghton", 1972));
        linkinPark.addMember(new MusicArtist("Mike Shinoda", 1977));
        MusicBand.transferMembers(queen,linkinPark);
        linkinPark.printMembers();
    }
}
