package task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*    Дан список Group(String title,  Students[] students), Student(String firstName, String lastName, Double rate).
        Используя Stream получить map<String, Double>, где ключ ФИО студента в формате Иванов.И, значение – рейтинг.
        В map должны попасть первые 3 самых успевающих студента из каждой группы. В данной задаче, предполагается,
        что студентов-однофамильцев нет.*/
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "Ivanov", 4.2);
        Student st2 = new Student("Nikita", "Nikitin", 7.1);
        Student st3 = new Student("Alex", "Alexeev", 6.0);
        Student st4 = new Student("Marina", "Moiseeva", 7.0);

        Student st5 = new Student("Anna", "Mikhaylova", 5.5);
        Student st6 = new Student("Xenia", "Belyaeva", 8.8);
        Student st7 = new Student("Stepan", "Stepanov", 3.7);
        Student st8 = new Student("Andrey", "Andreev", 8.1);

        Student st9 = new Student("Irina", "Mikheeva", 9.8);
        Student st10 = new Student("Vitaly", "Lenin", 4.7);
        Student st11 = new Student("Misha", "Andreev", 8.1);
        Student st12 = new Student("Irina", "Petrova", 9.3);

        Student[] arr1 = {st1, st3, st2, st4};
        Student[] arr2 = {st5, st7, st6, st8};
        Student[] arr3 = {st9, st10, st11, st12};

        Group group1 = new Group("Informatics", arr1);
        Group group2 = new Group("Mathematics", arr2);
        Group group3 = new Group("Programming", arr3);

        List<Group> groupList = List.of(group1, group2, group3);
        //   System.out.println(groupList);
        System.out.println(task3(groupList, 3));
    }

    public static Map<String, Double> task3(List<Group> students, int limit) {
        return students.stream()
                .flatMap((s -> Arrays.stream(s.getStudents())
                .sorted(Comparator.comparing(Student::getRate, Comparator.reverseOrder())).limit(limit)))
                .collect(Collectors.toMap(s -> s.getLastName() + " " + s.nameShortage(), Student::getRate));
    }
}