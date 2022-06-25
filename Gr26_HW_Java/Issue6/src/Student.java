import java.util.Arrays;

public class Student {
    static int[][] grades;
    String[] students;

    public Student(int[][] grades, String[] students) {
        this.grades = grades;
        this.students = students;
    }

    public static int[] scores(int[][] grades) {
        int[] totalScores = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                totalScores[i] += grades[i][j];
            }
        }
        return totalScores;
    }

    public static double[] gPA(int[][] grades, int[] scores) {
        double[] gpa = new double[scores.length];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                gpa[i] = 1.0 * scores[i] / grades[i].length;
            }
        }
        return gpa;
    }

    public static void concatGpaToNames(double[] gPA, String[] students) {
        if (gPA.length == students.length) {
            for (int i = 0; i < gPA.length; i++) {
                System.out.println(students[i] + " has GPA of:" + gPA[i] + ", ");
            }
        }
    }

    public static void bestStudent(double[] gPA, String[] students) {
        double max = gPA[0];
        int index = 0;
        if (gPA.length == students.length) {
            for (int i = 0; i < gPA.length; i++) {
                for (int j = 0; j < students.length; j++)
                    if (max < gPA[i]) {
                        max = gPA[i];
                        index = i;
                        break;
                    }
            }
            System.out.println("Student with best grades (" + max + ") " + " is: " + students[index]);
        }
    }

}
