import java.util.Arrays;
import java.util.Scanner;

public class Sapxep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a;

        System.out.print("Nhập sl phần tử mảng: ");
        int n = scanner.nextInt();
        a = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(a));
        Arrays.sort(a);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(a));

        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        double average = (double) sum / a.length;

        System.out.println("Tổng: " + sum);
        System.out.println("Giá trị trung bình: " + average);

        scanner.close();
    }
}

