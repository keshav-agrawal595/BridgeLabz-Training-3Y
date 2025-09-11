package StaticFinalKeywords;

class BankAccount {
    static String bankName = "ABC Bank";   // shared across all accounts
    static int totalAccounts = 0;

    final int accountNumber;               // cannot be changed
    String accountHolderName;

    // constructor using 'this'
    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Bank: " + bankName);
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Keshav");
        a1.display();
        BankAccount.getTotalAccounts();
    }
}
