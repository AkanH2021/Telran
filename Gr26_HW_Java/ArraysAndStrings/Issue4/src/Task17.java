public class Task17 {
    /*Дан массив целых чисел. Реализовать метод, который возвращает индекс минимального значение в данном массиве.
Например: {1,3,6,-1,4,-3,1} -> 5 */
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 3, 6, -1, 4, -3, 1};
        System.out.println(minIndex(testArray));
    }

    public static int minIndex(int[] array) {
        if (array.length == 0) return -1;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexMin] > array[i]) {
                indexMin = i;
            }
        }
        return indexMin;
    }
}
