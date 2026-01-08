package CollectionsGenerics;

public class Main {
    public static void main(String[] args) {
        Student<Integer> alice = new Student<>("Alice");
        alice.addGrade(80);
        alice.addGrade(90);
        alice.addGrade(85);

        Student<Integer> bob = new Student<>("Bob");
        bob.addGrade(60);
        bob.addGrade(70);
        bob.addGrade(65);

        StudentManager manager = new StudentManager();
        manager.addStudent(alice);
        manager.addStudent(bob);

        System.out.println("Alice average: " + manager.calcAvgGrade(alice));
        System.out.println("Bob average: " + manager.calcAvgGrade(bob));

        System.out.println("Students above 75:");
        for (Student<? extends Number> s : manager.findStudentsAboveThreshold(75)) {
            System.out.println(s.getName());
        }
    }
}
