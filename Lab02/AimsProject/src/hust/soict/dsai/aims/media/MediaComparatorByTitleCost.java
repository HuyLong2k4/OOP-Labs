package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo tiêu đề trước
        int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        // Nếu tiêu đề giống nhau, so sánh theo chi phí (giảm dần)
        if (titleComparison == 0) {
            return Float.compare(m2.getCost(), m1.getCost());
        }
        return titleComparison;
    }
}
