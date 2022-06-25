import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Дан список Student{String name, List} необходимо
//сформироватъ список StudentGPA {name, gpa - средний балл};
public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Jack", Arrays.asList(4, 2, 4, 5, 3, 5, 2, 3));
        Student st2 = new Student("John", Arrays.asList(4, 3, 4, 2, 3));
        Student st3 = new Student("Ivan", Arrays.asList(5, 5, 5, 4, 5, 4, 5));

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        System.out.println(transfrom(students));

    }

    public static List<StudentGPA> transfrom(List<Student> students) {
        List<StudentGPA> result = new ArrayList<>();
        if (students == null || students.isEmpty())
            return result;

        for (Student s : students) {
            result.add(new StudentGPA(s.getName(), s.getGpa()));
        }
        return result;
    }

}
