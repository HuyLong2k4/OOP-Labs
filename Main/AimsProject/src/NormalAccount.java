public class NormalAccount extends BankAccount {
    private static final long WITHDRAWFEE = 5000;

    public NormalAccount(String ownerName, String accountNumber, long initialBalance) {
        super(ownerName, accountNumber, initialBalance);
    }

    public void withdraw(long amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (initialBalance - amount - WITHDRAWFEE < MINIMUMBALANCE) {
            System.out.println("Withdrawal denied! Balance cannot go below minimum balance after fees.");
        } else {
            initialBalance -= (amount + WITHDRAWFEE);
            System.out.println(amount + " withdrawn successfully with a fee of " + WITHDRAWFEE);
        }
    }
}
