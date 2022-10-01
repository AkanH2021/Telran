package task3;

import java.util.Arrays;

public class Group {
    private String title;
    private Student[] students;

    public Group(String title, Student[] students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
