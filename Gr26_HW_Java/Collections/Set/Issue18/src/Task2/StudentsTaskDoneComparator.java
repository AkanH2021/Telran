package Task2;

import java.util.Comparator;

public class StudentsTaskDoneComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getTasksDone() > s2.getTasksDone())
            return -1;
        else if (s1.getTasksDone() < s2.getTasksDone())
            return 1;
        else
            return 0;
    }
}
