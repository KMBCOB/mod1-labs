package lab3;

import java.util.Scanner;

public class Utils {
    Scanner scanner;

    public Utils(){
        this.scanner = new Scanner(System.in);
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
