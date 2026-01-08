package CollectionsGenerics;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class StudentManager {
    HashMap<String, Student<? extends Number>> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    void addStudent(Student<? extends Number> student) {
        students.put(student.getName(), student);
    }

    double calcAvgGrade(Student<? extends Number> student) {
        double sum = 0;
        for(Number grade : student.getGrades()) {
            sum += grade.doubleValue();
        }
        return sum / student.getGrades().size();
    }

    public List<Student<? extends Number>> findStudentsAboveThreshold(double threshold) {
        ArrayList<Student<? extends Number>> result = new ArrayList<>();
        for(HashMap.Entry<String, Student<? extends Number>> s : students.entrySet()) {
            if (calcAvgGrade(s.getValue()) >= threshold) { result.add(s.getValue()); }
        }
        return result;
    }
}
