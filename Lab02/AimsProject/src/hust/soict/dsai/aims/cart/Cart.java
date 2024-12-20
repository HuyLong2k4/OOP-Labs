package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXMLLoader;

import java.util.ArrayList;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media media) {
        if(itemsOrdered.contains(media)) {
            System.out.println("Da co media");
        } else {
            itemsOrdered.add(media);
        }
    }

    public void removeMedia (Media media) {
        if(itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        } else {
            System.out.println("Khong ton tai Media");
        }
    }

    float totalSum = 0;
    public float totalOrder(Media media) {
        totalSum += media.getCost();
        return totalSum;
    }

    public float totalCost() {
        float total = 0;
        for(Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
}