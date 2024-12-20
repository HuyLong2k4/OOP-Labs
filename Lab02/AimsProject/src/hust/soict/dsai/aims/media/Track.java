package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
    private String title;
    private int length;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Kiểm tra xem có phải là cùng một đối tượng không
        if (o == null || getClass() != o.getClass()) return false; // Kiểm tra kiểu lớp
        Track track = (Track) o; // Ép kiểu đối tượng tham số
        return title != null ? title.equals(track.title) : track.title == null
                && length == track.length; // So sánh title và length
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() throws PlayerException {
        if( this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD lenght: " + this.getLength());
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive");
        }
    }
}
