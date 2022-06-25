public class Task18 {
    /*Дан массив целых чисел. Реализовать метод, который возвращает сумму всех
положительных элементов данного массива Например: {1,3,6,-1,4,-3,1} -> 15  */
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 3, 6, -1, 4, -3, 1};
        System.out.println(sumPositives(testArray));
        System.out.println(sumPositivesTernary(testArray));
        System.out.println(sumPositivesTernaryAndForEachWithMathMax(testArray));
    }

    public static int sumPositives(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static int sumPositivesTernary(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= (array[i]>0)?array[i]:0;
        }
        return sum;
    }

    public static int sumPositivesTernaryAndForEachWithMathMax(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += Math.max(j, 0);
        }
        return sum;
    }

}
