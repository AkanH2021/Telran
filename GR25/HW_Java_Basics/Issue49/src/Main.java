/* Implement the method that sorts the given array. Use one of the following algorithm:
Bubble sort, Cocktail shaker sort or Comb Sort. It will be good if you sort array of String, but the array of int will be good too.
You can use google for understanding the algorithm, but code you should write on your own.  */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 4, 81, 96, 7};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //  если они имеют неправильный порядок,
                //  то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    //   Слиянием:

    public class Merge {
        public static void main(String[] args) {
            int[] array = {10,5,8,20,18,7,3};
            mergeSort(array);
            System.out.println(Arrays.toString(array));
        }

        public static void mergeSort(int[] array) {
            int[] supportArray = Arrays.copyOf(array, array.length);
            int n = array.length;
            for (int size = 1; size < n; size *= 2) {
                for (int j = 0; j < n - size; j += 2 * size) {
                    merge(array, supportArray, j, j + size - 1, j + size, Math.min(j + 2 * size - 1, n - 1));
                }
            }
        }

        public static void merge(int[] array, int[] supportArray, int leftFirst, int leftend, int rightFirst, int rightEnd) {
            for (int i = leftFirst; i <= rightEnd; i++) {
                supportArray[i] = array[i];
            }
            int left = leftFirst;
            int rigth = rightFirst;
            for (int i = leftFirst; i <= rightEnd; i++) {
                if (left > leftend) {
                    array[i] = supportArray[rigth];
                    rigth += 1;
                } else if (rigth > rightEnd) {
                    array[i] = supportArray[left];
                    left += 1;
                } else if (supportArray[left] < supportArray[rigth]) {
                    array[i] = supportArray[left];
                    left += 1;
                } else {
                    array[i] = supportArray[rigth];
                    rigth += 1;
                }
            }
        }
    }

}