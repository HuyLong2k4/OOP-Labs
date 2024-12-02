package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo chi phí (giảm dần)
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        // Nếu chi phí giống nhau, so sánh theo tiêu đề
        if (costComparison == 0) {
            return m1.getTitle().compareTo(m2.getTitle());
        }
        return costComparison;
    }
}
