public class SavingAccount extends BankAccount {
    private float annualInterest;

    public SavingAccount(String ownerName, String accountNumber, long initialBalance, float annualInterest) {
        super(ownerName, accountNumber, initialBalance);
        this.annualInterest = annualInterest;
    }

    public long monthlyInterest() {
        long interest = (long) ((initialBalance * (annualInterest / 100)) / 12);
        System.out.println("Monthly interest: " + interest);
        return interest;
    }
}
