package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
 /* 3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(Log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}
    x = 2
    Вывод: 4 раза */
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        System.out.println(repeatedNumber(arr, 2));
        System.out.println(repeatedNumber1(arr, 2));
    }

    public static int repeatedNumber(int[] arr, int key) { //Time Complexity: O(n)
        int counter = 0;
        if (arr.length <= 1) {
            return -1;
        }
        for (int j : arr) {
            if (j == key) {
                counter++;
            }
        }
        return counter;
    }

    public static int repeatedNumber1(int[] arr, int key) { //Time Complexity: O(n)
        int counter = 0;
        if (arr.length <= 1) {
            return -1;
        }
        for (int j : arr) {
            if (j == key) {
                counter++;
            }
        }
        return counter;
    }
}
