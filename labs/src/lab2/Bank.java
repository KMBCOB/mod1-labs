package lab2;

public class Bank {
    Account[] accounts = new Account[3];

    Account addAccount(String owner, double balance) {
        for(int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(i, owner, balance);
                return accounts[i];
            }
        }
        return null;
    }

    Account getAccount(String owner) {
        for(Account acc : accounts) {
            if (acc.getOwner().equals(owner)) { return acc; }
        }
        return null;
    }
}
