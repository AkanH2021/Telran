import java.util.Arrays;

public class Task6 {
    /* Implement a method that makes a given array in reverse order. It’s look like previous
but you should solve it without new array
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10} */
    public static void main(String[] args) {
        int[] testArr = new int[]{10, 3, 3, 5, -9};
        System.out.println(reversedArray2(testArr));
    }

    public static String reversedArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[array.length - i - 1];
        }
        return Arrays.toString(array);
    }

}
