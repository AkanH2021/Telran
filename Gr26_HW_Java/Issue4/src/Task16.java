public class Task16 {
    /*Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве.
Например: {1,3,6,-1,4,-5,9} -> -5 */
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 3, 6, -1, 4, -5, 9};
        System.out.println(minimumValue(testArray));
        System.out.println(minValue2(testArray));
    }

    public static int minimumValue(int[] array) {
        if (array.length == 0) return -1;
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        return min;
    }


    //****from teacher
    public static int minValue2(int[] array) {
        if (array.length == 0) return -1;
        int min = array[0];
        for (int i = 1; i < array.length; min = (min > array[i]) ? array[i] : min, i++) ;
        return min;
    }

}


