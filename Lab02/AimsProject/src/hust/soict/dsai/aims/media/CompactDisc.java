package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("Da ton tai Track");
        } else {
            tracks.add(track);
        }
    }
    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Khong ton tai track trong TrackList");
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for(Track track: tracks) {
            totalLength += track.getLenght();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        for(Track track: tracks) {
            track.play();
        }
    }
}
