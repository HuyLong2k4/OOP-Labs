import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Year_MM_Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> monthDays = new HashMap<>();

        // Khởi tạo số ngày trong các tháng
        monthDays.put("January", 31);
        monthDays.put("Febuary", 28); // sẽ cập nhật cho năm nhuận
        monthDays.put("March", 31);
        monthDays.put("April", 30);
        monthDays.put("May", 31);
        monthDays.put("June", 30);
        monthDays.put("July", 31);
        monthDays.put("August", 31);
        monthDays.put("September", 30);
        monthDays.put("October", 31);
        monthDays.put("November", 30);
        monthDays.put("December", 31);

        while (true) {
            System.out.print("Nhập tên tháng (hoặc số tháng): ");
            String monthInput = scanner.nextLine().trim();
            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // để làm sạch dòng

            // Chuyển đổi tên tháng thành chữ cái viết hoa để so sánh
            int month = 0;

            // Kiểm tra nếu đầu vào là số
            if (monthInput.matches("\\d+")) {
                month = Integer.parseInt(monthInput);
            } else {
                switch (monthInput.toLowerCase()) {
                    case "jan":
                    case "january":
                        month = 1;
                        break;
                    case "feb":
                    case "february":
                        month = 2;
                        break;
                    case "mar":
                    case "march":
                        month = 3;
                        break;
                    case "apr":
                    case "april":
                        month = 4;
                        break;
                    case "may":
                        month = 5;
                        break;
                    case "jun":
                    case "june":
                        month = 6;
                        break;
                    case "jul":
                    case "july":
                        month = 7;
                        break;
                    case "aug":
                    case "august":
                        month = 8;
                        break;
                    case "sep":
                    case "september":
                        month = 9;
                        break;
                    case "oct":
                    case "october":
                        month = 10;
                        break;
                    case "nov":
                    case "november":
                        month = 11;
                        break;
                    case "dec":
                    case "december":
                        month = 12;
                        break;
                    default:
                        System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                        continue; // Bỏ qua vòng lặp và yêu cầu nhập lại
                }
            }

            // Kiểm tra năm
            if (year < 0) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            // Tính số ngày trong tháng
            int daysInMonth = monthDays.get(monthInput.toLowerCase()) != null ? monthDays.get(monthInput.toLowerCase()) : 0;

            // Kiểm tra năm nhuận
            if (month == 2) { // Tháng 2
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                }
            }

            System.out.println("Số ngày trong tháng " + monthInput + " năm " + year + " là: " + daysInMonth);
            break; // Kết thúc vòng lặp sau khi có kết quả
        }

        scanner.close();
    }
}
