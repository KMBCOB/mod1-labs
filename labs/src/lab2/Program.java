package lab2;

public class Program {
    public static void main (String[] args) {
        Account acc = new Account(1, "Bob", 10000.00);
        acc.deposit(2000.00);
        acc.withdraw(8500.00);
        System.out.println(acc.getDetails());

        Account[] arr ={
                new Account(2, "John", 5000.00),
                new Account(3, "Jane", 14000.00),
                new Account(4, "Sam", 7250.50)
        };

        for(Account account : arr) {
            System.out.println(account.getDetails());
        }

        Account myAccount = new Account(5, "Owen", 100);
        myAccount.addInterest();
        System.out.println(myAccount.getDetails());

        Account partnerAccount = myAccount;
        partnerAccount.addInterest();
        System.out.println(myAccount.getDetails());

        processAccount(myAccount);
        System.out.println(myAccount.getDetails());

        int k = 100;
        incInt(k);
        System.out.println(k);

        Bank bank = new Bank();
        System.out.printf("Account made for Tom? %s\n", bank.addAccount("Tom", 100) == null ? "No" : "Yes");
        System.out.printf("Account made for Dick? %s\n", bank.addAccount("Dick", 200) == null ? "No" : "Yes");
        System.out.printf("Account made for Harry? %s\n", bank.addAccount("Harry", 300) == null ? "No" : "Yes");
        System.out.printf("Account made for Paul? %s\n", bank.addAccount("Paul", 400) == null ? "No" : "Yes");

        System.out.printf("Account owned by %s found? %s\n", "Tom", bank.getAccount("Tom") == null ? "No" : "Yes");
        System.out.printf("Account owned by %s found? %s\n", "Paul", bank.getAccount("Paul") == null ? "No" : "Yes");

    }

    static void processAccount(Account acc) {
        acc.addInterest();
    }

    private static void incInt(int x) {
        x++;
    }
}
