package hust.soict.dsai.aims.media;


import java.util.Comparator;

public class Media {

    public static final Comparator<Media> COMPARABLE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARABLE_BY_COST_TITLE = new MediaComparatorByCostTitle();


    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, float cost, String category) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
