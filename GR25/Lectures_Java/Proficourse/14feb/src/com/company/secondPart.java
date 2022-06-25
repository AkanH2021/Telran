package com.company;

import java.util.Random;

public class secondPart {

    public static void main(String[] args) {
        int[] arr= getNewRandomArray(6,-30,30);
        printArr(arr);
        sort(arr);
        System.out.println("-------------------------");
        printArr(arr);
    }

    public static void sort(int[] arr){

        boolean swapFlag=true;
        while (swapFlag) {
            swapFlag=false;
            // i-1   i
            // []   [][][]
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i - 1] > arr[i]) {                // swap a[i] and a[i-1]
                    swapFlag = true;
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
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