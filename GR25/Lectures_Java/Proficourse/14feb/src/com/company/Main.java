package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static int[] getNewRandomArray(int size, int min, int max) {
        int[] res = new int[size];
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < size; i++) {
            res[i] = random.nextInt(max - min + 1) + min;
        }
        return res;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}