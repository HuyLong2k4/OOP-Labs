package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if(itemsInStore.contains(media)) {
            System.out.println("Da ton tai");
        } else {
            itemsInStore.add(media);
        }
    }

    public void removeMedia(Media media) {
        if(itemsInStore.contains(media)) {
            itemsInStore.remove(media);
        } else {
            System.out.println("Khong co media");
        }
    }

    public void print() {
        System.out.println("********** hust.soict.dsai.aims.store.Store Inventory **********");
        if ( itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("*************************************");
    }
}