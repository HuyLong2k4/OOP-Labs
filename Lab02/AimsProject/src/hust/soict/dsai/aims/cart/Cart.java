package hust.soict.dsai.aims.cart;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart if full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the cart.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" not found in cart.");
    }

    public void searchById(int id) {
        boolean found = false;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemOrdered[i].getId() == id) {
                System.out.println("DVD found: " + itemOrdered[i].toString());
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
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)) {
                System.out.println("DVD found: " + itemOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }

    public float totalCost() {
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
}