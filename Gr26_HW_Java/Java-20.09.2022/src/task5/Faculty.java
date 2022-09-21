package task5;

import java.util.Arrays;
import java.util.Iterator;

public class Faculty {
    private String name;
    private Student[] students;

    public Faculty(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}




