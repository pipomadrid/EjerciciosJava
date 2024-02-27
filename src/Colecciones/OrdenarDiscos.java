package Colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarDiscos {

    public static void main(String[] args) {
        List<Albums> albumList = new ArrayList<>();
        albumList.add(new Albums("M Clan", "Delta", "2016"));
        albumList.add(new Albums("Revolver", "Babilonia", "2015"));
        albumList.add(new Albums("Coti","Malditas Canciones","2009"));

        albumList.sort(Comparator.comparing(Albums::getYear));
        albumList.forEach(a-> System.out.println(a.getBand() + " " + a.getAlbumName()+ " " + a.getYear()));
    }
}

class Albums {

    private String band;
    private String albumName;
    private String year;

    public Albums(String band, String albumName, String year) {
        this.band = band;
        this.albumName = albumName;
        this.year = year;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
