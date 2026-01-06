package lab4;

public class Program {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
        System.out.println(findSum(numbers));
        System.out.println(findAvg(numbers));
        System.out.println(getMin(numbers));
        System.out.println(getMax(numbers));
        System.out.println(getZero(numbers));

        String[] students = {"John", "Jane", "Bob", "Sarah", "Sam"};
        int[] marks = {49, 53, 65, 84, 58};

        for(int i = 0; i < students.length; i++) {
            System.out.printf("%s: %s\n", students[i], getGrade(marks[i]));
        }

        System.out.printf("%d years", timeToDouble(100, 1.05F));

        multiplicationTable();
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    static float findAvg(int[] arr) {
        return (float) findSum(arr) / arr.length;
    }

    static int getMin(int[] arr) {
        int min = 0;
        for(int i : arr) {
            min = i < min ? i : min;
        }
        return min;
    }

    static int getMax(int[] arr) {
        int max = 0;
        for(int i : arr) {
            max = i > max ? i : max;
        }
        return max;
    }

    static int getZero(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { return i; }
        }
        return -1;
    }

    static String getGrade(int mark) {
        if (mark > 0 && mark < 50) {
            return "Fail";
        } else if (mark < 61) {
            return "Pass";
        } else if (mark < 71) {
            return "Merit";
        } else if (mark < 101) {
            return "Distinction";
        } else {
            return "Marks must be between 1..100";
        }
    }

    static int timeToDouble(float initial, float interest) {
        int years = 0;
        float target = initial * 2;
        while(initial < target) {
            initial *= interest;
            years++;
        }
        return years;
    }

    static void multiplicationTable() {
        for(int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println("\n");
        }
    }
}
