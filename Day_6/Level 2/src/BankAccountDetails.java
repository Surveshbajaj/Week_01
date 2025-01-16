// Class representing a bank account with basic operations
class BankAccount {
    // Fields to store account holder's name, account number, and balance
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor to initialize the bank account
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder; // Assign account holder's name
        this.accountNumber = accountNumber; // Assign account number
        this.balance = balance; // Assign initial balance
    }

    // Method to deposit money into the account
    public void depositMoney(double money) {
        // Display message about the deposit
        System.out.println(money + ": is Added in your account");
        // Update the balance
        balance += money;
    }

    // Method to withdraw money from the account
    public void withdrawMoney(double money) {
        // Check if there are sufficient funds for withdrawal
        if (balance >= money) {
            balance -= money; // Deduct the amount from the balance
            System.out.println("Successful withdraw of: " + money); // Display success message
        } else {
            // Display an error message if funds are insufficient
            System.out.println("Insufficient balance");
        }
    }

    // Method to display the current account balance
    public void displayCurrentBalance() {
        // Print the current balance
        System.out.println("Current balance is: " + balance);
    }
}

// Main class to demonstrate the functionality of the BankAccount class
public class BankAccountDetails {
    public static void main(String[] args) {
        // Create a BankAccount object with initial details
        BankAccount account1 = new BankAccount("yogesh", 482842258, 500000);

        // Demonstrate depositing money
        account1.depositMoney(200);

        // Demonstrate withdrawing money
        account1.withdrawMoney(5000);

        // Display the updated balance
        account1.displayCurrentBalance();
    }
}
