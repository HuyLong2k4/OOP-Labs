package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public  DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category, director, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category ,director, length, cost);
    }

    public boolean isMatch(String title) {
        return this.getTitle().equalsIgnoreCase(title);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD lenght: " + this.getLength());
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() +
                ", Length: " + getLength() + " Price: $" + getCost();
    }
}