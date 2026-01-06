package lab2;

public class Account {
    private int id;
    private String owner;
    private double balance;

    public Account(int id, String owner, double startingBalance) {
        this.id = id;
        this.owner = owner;
        this.balance = startingBalance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount < 0) { System.out.println("Cannot deposit a negative amount."); }
    }
    void withdraw(double amount) {
        if (amount > balance) { System.out.println("Insufficient funds in account."); }
    }

    String getDetails() {
        return String.format("Account: %d\nOwner: %s\nBalance: £%.2f", id, owner, balance);
    }

    public void addInterest() {
        balance *= 1.025;
    }
}
