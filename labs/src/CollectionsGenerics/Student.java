package CollectionsGenerics;

import java.util.ArrayList;
import java.util.List;

public class Student<T extends Number>{
    private String name;

    private List<T> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<T> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(T grade) {
        grades.add(grade);
    }
}
