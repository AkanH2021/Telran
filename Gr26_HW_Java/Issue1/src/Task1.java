public class Task1 {
    /*Implement a method that returns the index of the biggest element of a given array of int
    {10, 33, 3, 5, -9} -> 1 */
    public static void main(String[] args) {
        int[] testArr = new int[]{10, 33, 3, 5, -9};
        System.out.println(findMaxIndex(testArr));
    }

    public static int findMaxIndex(int[] array) {
        if (array.length == 0) return -1;
        int bigElement = array[0];
        int indexFind = 0;
        for (int i = 0; i < array.length; i++) {
            if (bigElement < array[i]) {
                bigElement = array[i];
                indexFind = i;
            }
        }
        return indexFind;
    }

}
