import java.util.Arrays;

public class GPA_MAIN_OOP_trial {
    /*Given two arrays. The first is String[n] students – names of students. The second is int[n][] grades –
   the array of grades for student homework. Every row of grades array is one student's grades
    (grades[k] is the grades of students[k]). Note, that each student has a different number of grades.
     You should implement the program that finds and displays the student with highest GPA and the score.
    Example:
{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75    */
    public static void main(String[] args) {
        String[] students = {"Jack", "Nick", "Mark"};
        int[][] grades = {{3, 4, 2}, {5, 5, 5, 4}, {3, 5, 4, 5}};

        System.out.println("Scores of students" + Arrays.toString(students) + " are: " + Arrays.toString(Student.scores(grades)));

        Student.concatGpaToNames(Student.gPA(grades, Student.scores(grades)), students);
        Student.bestStudent(Student.gPA(grades, Student.scores(grades)), students);
    }

}




