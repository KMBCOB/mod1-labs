package extra1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] currencyNames = {"Euro", "USD", "Yen"};
        double[] currencyRates = {1.15, 1.35, 211.27};
        ArrayList<Currency> currencies = new ArrayList<Currency>();

        for (int i = 0; i < currencyNames.length; i++) {
            currencies.add(new Currency(
                    currencyNames[i],
                    currencyRates[i]
            ));
        }
        Scanner scan = new Scanner(System.in);
        boolean active = true;
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Are you a VIP? [Y/N]");
        String isVip = scan.next();
        Customer customer = new Customer(
                name,
                age,
                isVip.equals("Y")
        );
        while (active) {
            Currency currency = null;
            while (currency == null) {
                System.out.println("Which currency are you converting to?");
                String currencyStr = scan.next();
                for (Currency c : currencies) {
                    if (c.getName().equalsIgnoreCase(currencyStr)) {
                        currency = c;
                    }
                }
                if (currency == null) {
                    System.out.println("Currency not found, please try again.");
                }
            }
            System.out.println("How much would you like to exchange?");
            ExchangeTransaction exTran = new ExchangeTransaction(
                    customer,
                    currency,
                    scan.nextDouble()
            );
            exTran.processTransaction();
            System.out.println("Would you like to make another transaction? [Y/N]");
            active = scan.next().equalsIgnoreCase("Y");
        }
        System.out.println("Thank you for shopping with us!");
    }
}
