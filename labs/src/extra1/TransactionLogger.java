package extra1;

public class TransactionLogger {
    private String receipt;

    public TransactionLogger(String receipt) {
        this.receipt = receipt;
    }

    public String getReceipt() {
        return receipt;
    }
}
