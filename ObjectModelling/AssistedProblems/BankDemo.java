package ObjectModelling.AssistedProblems;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " at " + bankName);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer c1 = new Customer("Rahul", 5000);
        Customer c2 = new Customer("Keshav", 8000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
