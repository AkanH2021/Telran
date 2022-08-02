public class Task2 {
    /* Implement a method that returns the sum of elements of the given array of int
{10, 3, 23, 5, -9} -> 32 */
    public static void main(String[] args) {
        int[] testArr = new int[]{10, 3, 23, 5, -9};
        System.out.println(sumElements(testArr));
    }

    public static int sumElements(int[] array) {
        if (array.length ==0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
