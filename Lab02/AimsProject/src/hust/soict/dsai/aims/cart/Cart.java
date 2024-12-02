package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

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
    public void searchById(int id) {
        boolean found = false;
        for(int i =0; i < itemsOrdered.size(); i++) {
            if(itemsOrdered.get(i).getId() == id) {
                System.out.println("DVD found: " + itemsOrdered.get(i).toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i <= itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle() == title) {
                System.out.println("DVD found: " + itemsOrdered.get(i).toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
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