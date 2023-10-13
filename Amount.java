public class Amount {
    private double amount;
    private String transactionType;

    /**
     * Constructor to create an Amount object with the specified amount and transaction type.
     *
     * @param amount          The transaction amount.
     * @param transactionType The type of transaction (e.g., "Deposit" or "Withdrawal").
     */
    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction: " + transactionType + " - Amount: $" + amount;
    }
}
