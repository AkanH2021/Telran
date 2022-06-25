import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        task3(4, 3, 5);

        System.out.println(Arrays.deepToString((getNewRandomArray(3, 4, -50, 50))));

    }

    //Task 3. Implement the method that create an array int[n][n] of random integers
    public static void task3(int size, int min, int max) {
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[][] arrDouble = new int[size][size];
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(max);
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = random.nextInt(min);
                arrDouble[i][j] = random.nextInt(max - min + j) + i;   //(max - min + 1) + min;
            }
        }
        System.out.print(Arrays.deepToString(arrDouble));
        System.out.println();
    }

    //from teacher:
    public static int[][] getNewRandomArray(int rows, int columns, int min, int max) {
        int[][] array = new int[rows][columns];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return array;
    }
}