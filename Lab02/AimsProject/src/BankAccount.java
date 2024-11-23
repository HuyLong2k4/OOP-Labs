public class BankAccount {
    private String owner;
    private boolean balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean getBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    public boolean debit(double money) {
        if( money > balance )
            return false;
        else {
            balance = balance - money;
        }
    }

    public void credit( double money) {
        return balance = balance + money;
    }
}
