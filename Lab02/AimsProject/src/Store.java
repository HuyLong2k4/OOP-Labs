import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        if(dvd != null) {
            itemsInStore.add(dvd);
        } else {
            System.out.println("DVD khong hop le");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {

        if(itemsInStore.remove(dvd)) {
            System.out.println("Đã xoá thành công");
        } else {
            System.out.println("Khong tim thay DVD");
        }
    }

    public void print() {
        System.out.println("********** Store Inventory **********");
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