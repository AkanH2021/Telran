import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arrayTest = {"Sony", "JVC", "LG", "Akai", "AKG", "Nokia"};
        System.out.println(taskStringGroups1(arrayTest));
    }

    /*Imagine that you have an array of strings of random length. Implement the method that returns how many groups
    of strings grouped by the same length are present. For example, there are 5 lines in the array: 2 are 10 characters long,
    2 are 18 characters long and one is 4 characters long. So in this array there are 3 different groups. */
    public static int taskStringGroups1(String[] arrayTest) {
        int res = 1;
        int[] newLengths = new int[arrayTest.length];
        for (int i = 0; i < arrayTest.length; i++) {
            newLengths[i] = arrayTest[i].length();
        }
        Arrays.sort(newLengths);
        for (int i = 0; i < arrayTest.length - 1; i++) {
            if (newLengths[i] != newLengths[i + 1]) {
                res += 1;
            }
        }
        return res;
    }
}