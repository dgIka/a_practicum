package Day_12.Task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public void addMember(MusicArtist member) {
        this.members.add(member);
    }
    public void removeMember(MusicArtist member) {
        if (members.contains(member)) {
            members.remove(member);
        }
    }
    public static void transferMembers(MusicBand a, MusicBand b) {
         for (MusicArtist member: a.getMembers()){
             b.addMember(member);
         }
    }
    public void printMembers () {
        for (MusicArtist a: this.getMembers()) {
            System.out.println(a);
        }
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getYear();
    }
}
