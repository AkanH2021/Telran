import java.util.Arrays;

public class Task4 {
    /*  Implement the method that takes a two-dimensional array and return the single-dimensional array with
    all elements of the given array     ({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6} */

    public static void main(String[] args) {
        int[][] testArr = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.toString(twoDimensionaltoOneDimensionalArray(testArr)));
    }

    public static int[] twoDimensionaltoOneDimensionalArray(int[][] array) {
        int[] newArr = new int[array.length * array[0].length];
        if (newArr.length <= 0) {
            return newArr;
        }
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArr[value] = array[i][j];
                value++;
            }
        }
        return newArr;
    }
}
