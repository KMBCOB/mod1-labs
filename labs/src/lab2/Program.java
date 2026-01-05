package lab2;

public class Program {
    public static void main (String[] args) {
        int mark = (int) Math.floor(101 * Math.random());

        if (mark > 0 && mark < 50) {
            System.out.println("Fail");
        } else if (mark < 61) {
            System.out.println("Pass");
        } else if (mark < 71) {
            System.out.println("Merit");
        } else if (mark < 101) {
            System.out.println("Distinction");
        } else {
            System.out.println("Marks must be between 1..100");
        }
    }
}
