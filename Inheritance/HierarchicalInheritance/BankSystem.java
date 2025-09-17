package Inheritance.HierarchicalInheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, int limit) {
        super(accountNumber, balance);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod;

    FixedDepositAccount(int accountNumber, double balance, int lockIn) {
        super(accountNumber, balance);
        this.lockInPeriod = lockIn;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Lock-in Period: " + lockInPeriod + " years");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 50000, 5);
        CheckingAccount c = new CheckingAccount(102, 20000, 3);
        FixedDepositAccount f = new FixedDepositAccount(103, 100000, 5);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
