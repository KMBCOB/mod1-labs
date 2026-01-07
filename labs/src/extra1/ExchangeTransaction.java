package extra1;

public class ExchangeTransaction {
    private Customer customer;
    private Currency currency;
    private double gbpAmount;

    public ExchangeTransaction(Customer customer, Currency currency, double gbpAmount) {
        this.customer = customer;
        this.currency = currency;
        this.gbpAmount = gbpAmount;
    }

    public double calculateServiceFee() {
        return gbpAmount < 100 ? gbpAmount * 0.05 : gbpAmount * 0.025;
    }

    public double calculateTax(double amountAfterFee) {
        return customer.isVip() ? amountAfterFee * 0.05 : amountAfterFee * 0.10;
    }

    public void processTransaction() {
        double afterFee = gbpAmount - calculateServiceFee();
        double afterTax = afterFee - calculateTax(afterFee);
        double finalAmount = currency.convertToGBP(afterTax);
        int rounded = (int) finalAmount;
        TransactionLogger transLog = new TransactionLogger(String.format("Name: %s\nDeposit: %.2f\nAfter fees: %.2f\nAfter tax: %.2f\nCurrency: %s\nFinal amount: %.2f",
                customer.getName(),
                gbpAmount,
                afterFee,
                afterTax,
                currency.getName(),
                finalAmount));
        System.out.println(transLog.getReceipt());
    }
}
