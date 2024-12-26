package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXMLLoader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public int qtyOrdered = 0;
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

    public Media searchToRemove(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }

    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            qtyOrdered = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }

    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();

        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }

    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(keyword)) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no media were found with \"" + keyword + "\" in the title!");
        }
    }

    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no media were found that match the ID provided!");
        }
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