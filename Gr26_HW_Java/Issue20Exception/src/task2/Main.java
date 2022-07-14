package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*  Допустим, Ваш метод должен получить массив int размером 10x10 элементов. Необходимо, что бы ваш метод
бросал IllegalArgumentException если размер переданного массива некорректен или вместо массива пришел null. */
        int[][] testArray1 = new int[10][10];
        int[][] testArray2 = null;
        int[][] testArray3 = new int[10][11];;

        task2(testArray1);
        task2(testArray2);
        task2(testArray3);
    }

    public static void task2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    if (array == null)
                        throw new IllegalArgumentException();
                    if ((array[i].length >= 10) && (array[j].length >= 10))
                        throw new IllegalArgumentException();
                } catch (NullPointerException ex1) {
                    System.out.println("Incoming array as null");
                } catch (Exception ex2) {
                    System.out.println("Array lenght is not correct");
                }
            }
        }
    }
}



