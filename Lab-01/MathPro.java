import java.util.Scanner;

public class MathPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhap so thu nhat: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);  // Chuyển từ chuỗi sang double

        System.out.print("Nhap so thu hai: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);  
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Khong the chia cho 0.");
        }
        scanner.close();
    }
}