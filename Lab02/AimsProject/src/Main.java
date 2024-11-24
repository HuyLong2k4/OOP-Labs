public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản NormalAccount
        NormalAccount normalAcc = new NormalAccount("John Doe", "123456789", 100000);
        normalAcc.deposit(50000);
        normalAcc.withdraw(30000);
        normalAcc.withdraw(200000); // Thử rút quá số dư cho phép

        // Tạo tài khoản SavingAccount
        SavingAccount savingAcc = new SavingAccount("Jane Doe", "987654321", 200000, 5.0f);
        savingAcc.deposit(100000);
        savingAcc.monthlyInterest();
    }
}