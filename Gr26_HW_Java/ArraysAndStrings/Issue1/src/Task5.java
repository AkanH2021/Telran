import java.util.Arrays;

public class Task5 {
    /* Implement a method that returns the new array that is the given array in reverse order
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10} */

    public static void main(String[] args) {
        int[] testArr = new int[]{10, 3, 3, 5, -9};
        System.out.println(reversedArray(testArr));

    }

    public static String reversedArray(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[array.length - i - 1];
        }
        return Arrays.toString(newArr);
    }

}

