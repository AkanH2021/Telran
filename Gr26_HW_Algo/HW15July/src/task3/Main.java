package task3;

public class Main {

    public static void main(String[] args) {
 /* 3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(Log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}
    x = 2
    Вывод: 4 раза */
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        int n = arr.length;
        int x = 2;

        System.out.println(repeatedNumber2(arr, n, x));
        System.out.println(repeatedNumber(arr, 2));
    }

    static int binarySearch(int[] arr, int left, int right, int x) {
        if (right < left) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearch(arr, left,
                    mid - 1, x);
        return binarySearch(arr, mid + 1, right, x);
    }

    static int repeatedNumber2(int[] arr, int n, int x) {  //Time Complexity: O(log n)
        int index = binarySearch(arr, 0,
                n - 1, x);
        if (index == -1)
            return 0;
        int count = 1;
        int left = index - 1;
        while (left >= 0 &&
                arr[left] == x) {
            count++;
            left--;
        }
        int right = index + 1;
        while (right < n &&
                arr[right] == x) {
            count++;
            right++;
        }
        return count;
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
}
