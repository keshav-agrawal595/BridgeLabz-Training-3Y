// Bank Account Management
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int acc, String holder, double bal) {
        accountNumber = acc;
        accountHolder = holder;
        balance = bal;
    }

    // public methods for balance
    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    void showAccount() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// subclass accessing public and protected members
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, String holder, double bal, double rate) {
        super(acc, holder, bal);
        interestRate = rate;
    }

    void showSavingsInfo() {
        System.out.println("Savings Account of " + accountHolder + " (" + accountNumber + "), Interest: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(1001, "Ankit", 5000, 4.5);
        s1.showAccount();
        s1.showSavingsInfo();
        s1.deposit(2000);
        s1.withdraw(1000);
        System.out.println("Updated Balance: " + s1.getBalance());
    }
}
