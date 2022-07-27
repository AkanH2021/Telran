package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*  2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
    находиться на k-й позиции в конечном отсортированном массиве.
    Массив 1 - 100 112 256 349 770
    Массив 2 - 72 86 113 119 265 445 892
    к = 7
    Вывод : 256
    Окончательный отсортированный массив -
    72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
    7-й элемент этого массива равен 256.  */
        int[] arr1 = new int[]{100, 112, 256, 349, 770};
        int[] arr2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        task2(arr1, arr2, 3);

        printing(sorting(merging(arr1, arr2)), 7);

    }

    public static void task2(int[] arr1, int[] arr2, int k) {
        int[] resArr = new int[arr1.length + arr2.length];
        int newValue = 0;

        for (int i : arr1) {
            resArr[newValue] = i;
            newValue++;
        }

        for (int j : arr2) {
            resArr[newValue] = j;
            newValue++;
        }
        Arrays.sort(resArr); //Arrays.sort method uses Quicksort for arrays of primitives
        System.out.println("Number = " + resArr[k] + ", index: " + k);
    }

    public static int[] merging(int[] arr1, int[] arr2) {
        int[] resArr = new int[arr1.length + arr2.length];
        int newValue = 0;

        for (int i : arr1) {
            resArr[newValue] = i;
            newValue++;
        }

        for (int j : arr2) {
            resArr[newValue] = j;
            newValue++;
        }
        return resArr;
    }

    public static int[] sorting(int[] arr) {  //bubbleSort
        int size = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sorting1(int[] arr) {  //insertionSort
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while ((i >= 0) && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] sorting2(int[] arr) {  //selectionSort
        int size = arr.length;
        for (int i = size - 1; i >= 0; i--) {
            int ind_max = i;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[ind_max]) {
                    ind_max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[ind_max];
            arr[ind_max] = tmp;
        }
        return arr;
    }

    public static void printing(int[] arr, int indexWish) {
        for (int i = 0; i < arr.length; i++) {
            if (i == indexWish)
                System.out.println("Number = " + arr[indexWish] + ", index: " + indexWish);
        }
    }

}