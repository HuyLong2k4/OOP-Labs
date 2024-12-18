package hust.soict.dsai.aims.media;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Kiểm tra xem có phải là cùng một đối tượng không
        if (o == null || getClass() != o.getClass()) return false; // Kiểm tra kiểu lớp
        Media media = (Media) o; // Ép kiểu đối tượng tham số
        return title != null ? title.equals(media.title) : media.title == null; // So sánh thuộc tính title
    }

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
