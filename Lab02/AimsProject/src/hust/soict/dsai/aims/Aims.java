package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", " Animation", "Roger Allers", 87, 19.95f);
        // Add DVD to hust.soict.dsai.aims.cart.Cart
        anOder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
        anOder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOder.addMedia(dvd3);

        anOder.removeMedia(dvd3);

        System.out.println("Total cost is: ");
        System.out.println(anOder.totalCost());
    }
}