package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int lenght;

    public Track(String title, int length) {
        this.title = title;
        this.lenght = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLenght() {
        return lenght;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD lenght: " + this.getLenght());
    }
}
