package Day_12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("Linkin Park", 1992);
        MusicBand musicBand1 = new MusicBand("Hollywood Undead", 2001);
        MusicBand musicBand2 = new MusicBand("Queen", 1968);
        MusicBand musicBand3 = new MusicBand("Red hot chilli peppers", 1990);
        MusicBand musicBand4 = new MusicBand("Scorpions", 1981);
        MusicBand musicBand5 = new MusicBand("The Beatles", 1970);
        MusicBand musicBand6 = new MusicBand("Black sabbath", 1980);
        MusicBand musicBand7 = new MusicBand("Papa roach", 2000);
        MusicBand musicBand8 = new MusicBand("Skillet", 2001);
        MusicBand musicBand9 = new MusicBand("Within temptatiom", 1996);
        List<MusicBand> list = new ArrayList<>();
        list.add(musicBand);
        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(groupsAfter2000(list));
    }
    public static List<MusicBand> groupsAfter2000 (List<MusicBand> list) {
        List<MusicBand> youngBands = new ArrayList<>();
        for (MusicBand a : list) {
            if (a.getYear() >= 2000) {
                youngBands.add(a);
            }

        }
        return youngBands;
    }
}
