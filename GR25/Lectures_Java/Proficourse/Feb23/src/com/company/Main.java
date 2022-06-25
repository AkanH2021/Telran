package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = randomArray(19, -10, 10);

        printArray(arr);
        mergeSort(arr);
        printArray(arr);

//int[] arr1 ={5,8};
        //int[] arr2 ={1,9,10};
        //merge(arr,arr1,arr2);
    }

    public static int[] randomArray(int size, int min, int max) {
        Random ran = new Random((System.currentTimeMillis()));
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = ran.nextInt(max - min + 1) + min;
        }
        return res;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }

    public static void mergeSort(int[] arr) {
        int arrLength = arr.length;
        if (arrLength < 2) {
            return;
        }
        int middleIndex = arrLength / 2;
        int[] leftHaif = new int[middleIndex];
        int[] rightHaif = new int[arrLength - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftHaif[i] = arr[i];
        }

        for (int i = middleIndex; i < arrLength; i++) {
            rightHaif[i - middleIndex] = arr[i];

        }
        mergeSort(leftHaif);
        mergeSort(rightHaif);
        merge(arr, leftHaif, rightHaif);
    }

    public static void merge(int[] arr, int lefthalf[], int[] righthalf) {
        int leftSize = lefthalf.length;
        int rightSize = righthalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (lefthalf[i] <= righthalf[j]) {
                arr[k] = lefthalf[i];
                i++;
            } else {
                arr[k] = righthalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = lefthalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = righthalf[j];
            j++;
            k++;
        }
    }
}