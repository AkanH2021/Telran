package task5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //    Вывести имена всех студентов на всех факультетах.
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 21, 5, 7.7);

        Student[] stArr1 = {s1, s2, s3};
        Student[] stArr2 = {s4, s5};

        Faculty f1 = new Faculty("C++", stArr1);
        Faculty f2 = new Faculty("Java", stArr2);

//    f1.addStOnF(s1);
//    f1.addStOnF(s2);
//    f1.addStOnF(s3);
//    f2.addStOnF(s4);
//    f2.addStOnF(s5);
        System.out.println(f1);
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        //   System.out.println(facultyList);
        System.out.println(task5(facultyList));
    }

    public static Map<String, Double> task5(List<Faculty> facultyList) {
        return facultyList.stream()
                .flatMap((s -> Arrays.stream(s.getStudents())
                        .sorted(Comparator.comparing(Student::getRate, Comparator.reverseOrder()))))
                .collect(Collectors.toMap(s -> s.getFirstName() + " " + s.getGender(), Student::getRate));
    }

    

}

