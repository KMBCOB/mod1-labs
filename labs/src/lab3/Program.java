package lab3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        theLunchQueue();
    }

    public static int getInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextInt();
    }

    public static String getString(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextLine();
    }

    public static void theLunchQueue() {
        Utils utils = new Utils();
        String mainCourse = utils.getString("What main dish would you like(Fish, Burgers or veg)?");
        int numPotatoes = utils.getInt("How many roast potatoes would you like?"),
                numSprouts = utils.getInt("How many brussels sprouts would you like?");
        System.out.printf("Hello, your lunch is %s with %d roast potato%s and %d brussels sprout%s.",
                mainCourse,
                numPotatoes,
                numPotatoes == 1 ? "" : "es",
                numSprouts,
                numSprouts == 1 ? "" : "s");
    }

    static void convertInputToStonesPounds(int pounds) {
        System.out.printf("%d Stone %d Pound%s",
                pounds / 14,
                pounds % 14,
                pounds % 14 == 1 ? "" : "s");
    }

    static void convertKgsToStonesPounds(int kgs) {
        convertInputToStonesPounds((int) (kgs * 2.20462));
    }
}
