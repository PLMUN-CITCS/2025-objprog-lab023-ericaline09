// Define the BankAccount class
class BankAccount {
    // Declare instance variables (attributes) with different access modifiers
    public String accountHolder;  // public: can be accessed from anywhere
    private double balance;        // private: can only be accessed within the BankAccount class
    protected String accountType;  // protected: can be accessed within the same package or subclasses

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance (as balance is private, we need this method to access it)
    public double getBalance() {
        return balance;
    }
}

// Main class to run the program
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create an object of the BankAccount class
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
        
        // Deposit some money into the account
        myAccount.deposit(250.0);
        
        // Withdraw some money from the account
        myAccount.withdraw(100.0);

        // Print the account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
