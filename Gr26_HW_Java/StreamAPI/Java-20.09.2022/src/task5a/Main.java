package task5a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 21, 5, 7.7);
        Faculty f1 = new Faculty("C++");
        Faculty f2 = new Faculty("Java");
        f1.addStOnF(s1);
        f1.addStOnF(s2);
        f1.addStOnF(s3);
        f2.addStOnF(s4);
        f2.addStOnF(s5);
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        System.out.println(f1);

        System.out.println(task5a(facultyList));
    }

        public static Map<String, List<Student>> task5a(List<Faculty> facultyList) {
        return facultyList.stream()
                .collect(Collectors.toMap(Faculty::getName,
                        s-> Arrays.asList(s.getAllStudents())));
    }
}

//    public static Map<String, Stream<String>> task5a(List<Faculty> facultyList) {
//        return facultyList.stream()
//                .collect(Collectors.toMap(s -> s.getName(), s -> Arrays.stream(s.getAllStudents()).map(Student::getFirstName)));
//    }