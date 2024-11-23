public class SavingAccount extends BankAccount{
    public SavingAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double money) {
        if(getBalance() - money < 100) {
            System.out.println("Số dư tối thiểu là 100");
        } else {
            super.debit(money);
        }
    }
}
