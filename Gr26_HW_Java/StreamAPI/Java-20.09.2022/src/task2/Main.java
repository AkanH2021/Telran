package task2;

import task1.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //    отфильтровать студентов age>22 , вывести на экран пропустить первого [есть метод для пропуска ]
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Ivanov", 23);
        Student st2 = new Student("Nikita", "Nikitin", 21);
        Student st3 = new Student("Marina", "Moiseeva", 24);
        Student st4 = new Student("Anna", "Mikhaylova", 21);
        Student st5 = new Student("Xenia", "Belyaeva", 23);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        task2(studentList);
    }

    public static void task2(List<Student> studentList) {
        studentList.stream()
                .filter(student -> student.getAge() > 22)
                .skip(1)
                .forEachOrdered(student -> System.out.println(student));
    }
}
