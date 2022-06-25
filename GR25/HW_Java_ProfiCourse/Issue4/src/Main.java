import java.util.Arrays;

public class Main {
    /*Given two arrays. The first is String[n] students – names of students. The second is int[n][] grades –
    the array of grades for student homework. Every row of grades array is one student's grades
     (grades[k] is the grades of students[k]). Note, that each student has a different number of grades.
      You should implement the program that finds and displays the student with highest GPA and the score.
     Example:
{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75    */
    public static void main(String[] args) {
        String[] students = {"Jack", "Nick", "Mark"};
        int[][] grades = {{3, 4, 2}, {5, 5, 5, 4}, {3, 5, 4, 5}};
        double[] studentsGPA = studentsGPA(grades);

        System.out.println((Arrays.toString(studentsGPA(grades))));
        System.out.println("******************");
        findBestStudentGPA(studentsGPA, students);
    }

    public static double[] studentsGPA(int[][] grades) {
        double[] gpa = new double[grades.length];

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                gpa[i] += grades[i][j];
            }
            gpa[i] /= grades[i].length;
        }
        return gpa;
    }

    public static void findBestStudentGPA(double[] studentsGPA, String[] students) {
        double maximumGpa = studentsGPA[0];
        int index = 0;
        for (int i = 1; i < studentsGPA.length; i++) {
            if (studentsGPA[i] > maximumGpa) {
                maximumGpa = studentsGPA[i];
                index = i;
            }
        }
        System.out.println("Student with best grades (" + maximumGpa + ") " + " is: " + students[index]);
    }

}