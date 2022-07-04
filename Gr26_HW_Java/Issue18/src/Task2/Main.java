package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
  /* 1. Given a list of String. You need to get a list of unique strings from the original list that consist of at least two words (words are separated by a space).
  2.  You have two classes Student{String name, int tasksDone} (the tasksDone field is the number of completed tasks) and a Group{String title, List<Student>} class.
  Given a list of Group. It is necessary to get a list of 3 students who have solved the largest number of problems.
 Please note that one student can attend a lesson in several groups. Hint: You must use a Set of students.  */

        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Nikita", 7);
        Student st3 = new Student("Alex", 6);
        Student st4 = new Student("Marina", 7);
        Student st5 = new Student("Anna", 5);
        Student st6 = new Student("Xenia", 8);
        Student st7 = new Student("Stepan", 3);
        Student st8 = new Student("Andrey", 8);
        Student st9 = new Student("Irina", 9);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(st1);
        studentList1.add(st3);
        studentList1.add(st2);
        studentList1.add(st5);
        studentList1.add(st4);
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(st9);
        studentList2.add(st7);
        studentList2.add(st6);
        studentList2.add(st8);
        studentList2.add(st3);
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(st4);
        studentList3.add(st8);
        studentList3.add(st9);
        studentList3.add(st7);
        studentList3.add(st3);

        Group group1 = new Group("Informatics", studentList1);
        Group group2 = new Group("Mathematics", studentList2);
        Group group3 = new Group("Programming", studentList3);

        List<Group> group = new ArrayList<>();
        group.add(group1);
        group.add(group2);
        group.add(group3);
        System.out.println(task2(group));
    }

    public static TreeSet<Student> task2(List<Group> groupList) {
        Comparator<Student> comp = new StudentsTaskDoneComparator();
        TreeSet<Student> stSet = new TreeSet<>(comp);
        for (Group gr : groupList) {
            stSet.addAll(gr.getStList());
        }
        return stSet;
    }
}


