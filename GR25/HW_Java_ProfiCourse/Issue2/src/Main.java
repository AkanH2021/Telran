import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 8, 9, 12};
        int sum = task1(arr);
        System.out.println(sum);

        System.out.println(sumArray(arr, 0));
    }

    //Task 1. Implement the method that calculates the sum of integer array. You should not use any loops. Use the recursion.
    public static int task1(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int index = 0;
        while (true) {
            sum += arr[index++];
            if (index < n) {
                continue;
            } else {
                break;
            }
        }
        return sum;
    }

    //from teacher
    public static int sumArray(int[] array, int index) {
        if (index==array.length) {
            return 0;
        }
        return array[index] + sumArray(array, index + 1);
    }
}
