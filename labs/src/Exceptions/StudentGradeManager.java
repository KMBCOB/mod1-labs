package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeManager {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        boolean active = true;
        while (active) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            int grade = inputGrade(scanner);
            scanner.nextLine();
            System.out.println("Student " + name + " has grade " + grade);
            System.out.println("Enter another student's grade? [Y/N]");

            active = scanner.nextLine().equalsIgnoreCase("Y");
        }
        scanner.close();
    }

    public static int inputGrade(Scanner scanner) {
        int input;
        System.out.print("Enter grade (0-100): ");
        try {
            input = scanner.nextInt();
            checkGrade(input);
        } catch(InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
            input = inputGrade(scanner);
        } catch(InvalidGradeException e) {
            System.out.println(e.getMessage());
            scanner.nextLine();
            input = inputGrade(scanner);
        }
        return input;
    }

    public static void checkGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) throw new InvalidGradeException("Grade must be between 0 and 100.");
    }
}

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
