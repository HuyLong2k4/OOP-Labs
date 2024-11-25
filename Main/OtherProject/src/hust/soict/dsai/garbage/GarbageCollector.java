package hust.soict.dsai.garbage;

public class GarbageCollector {
    public static void main(String[] args) {
        try {
            while (true) {
                String garbage = new String(new char[1000000]);
                System.out.println("Created garbage: " + garbage);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory error occurred. Too much garbage created.");
        }
    }
}
