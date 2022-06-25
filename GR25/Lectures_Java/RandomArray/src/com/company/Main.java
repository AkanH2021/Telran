package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    int[] arr = getNewRandomArray(20, -100, 100);
        printArr(arr);
        // int[] arr1 = getNewRandomArray2;

    }

    public static int[] getNewRandomArray(int size, int min, int max) {
        int[] res = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            res[i] = random.nextInt(max-min+1)+min;
        }

        return res;
    }

    public static int[] getNewRandomArray2(int size, int min, int max) {
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return res;
    }



public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
    }
}

}
