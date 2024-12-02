package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    private static List<Media> items = new ArrayList<>();
    private static Store store = new Store();
    private static Cart cart = new Cart();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void viewStore() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                mediaDetailsMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("So cart hien tai la: " + items.size());
                break;
            case 2:
                break;
            case 0:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
    }
    public static void updateStore() {

    }

    public static void seeCurrentCart() {
        cartMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Search();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void Search() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Search by Id");
        System.out.println("2. Search by Title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 0:
                System.out.println("Exiting program...");
                return;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
    }
}