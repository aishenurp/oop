import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

 
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

   
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Amount(amount, "Deposit"));
    }

   
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

   
    public int getAccountNumber() {
        return accountNumber;
    }

   
    public String getAccountHolder() {
        return accountHolder;
    }

    public static void main(String[] args) {
        // Sample usage and testing
        PersonalAccount account = new PersonalAccount(12345, "John Doe");
        account.deposit(1000.0);
        account.withdraw(500.0);
        account.deposit(200.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        account.printTransactionHistory();
    }
}
