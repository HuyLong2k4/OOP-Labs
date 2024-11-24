class Cart {
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
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            } else {
                System.out.println("The cart if full");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        
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

    public float totalCost() {
        float total = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
}

