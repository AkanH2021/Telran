package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 1, 8, 3};
        bubbleSort(array);

    } public static void bubbleSort(int[] array){
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }System.out.println(Arrays.toString(array));
    }
}
