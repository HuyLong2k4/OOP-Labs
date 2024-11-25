public class BankAccount {
    protected String ownerName;
    protected String accountNumber;
    protected long initialBalance;
    protected static final long MINIMUMBALANCE = 50000;

    public BankAccount(String ownerName, String accountNumber, long initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}
