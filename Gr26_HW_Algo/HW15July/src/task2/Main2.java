package task2;

import java.util.Arrays;

public class Main2 {
    /*  2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет
  находиться на k-й позиции в конечном отсортированном массиве.
  Массив 1 - 100 112 256 349 770
  Массив 2 - 72 86 113 119 265 445 892
  к = 7
  Вывод : 256
  Окончательный отсортированный массив -
  72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
  7-й элемент этого массива равен 256.  */

    public static void main(String[] args) {

        int[] arr1 = new int[]{100, 112, 256, 349, 770};
        int[] arr2 = new int[]{72, 86, 113, 119, 265, 445, 892};

        task2(arr1, arr2, 7);
    }

    public static void task2(int[] arr1, int[] arr2, int k) {

        int newLength = arr1.length + arr2.length;
        int[] res = new int[newLength];
        if (k <= newLength) {
            System.out.println("index of element is: " + k);
        } else {
            System.out.println("K is out of array size, please choose k less than " + newLength);
        }
        int leftIndex = 0;   //index of arr1
        int rightIndex = 0;  //index of arr2
        int arrIndex = 0;    //index of res

        while (leftIndex < arr1.length && rightIndex < arr2.length) {
            if (arr1[leftIndex] < arr2[rightIndex]) {//сравниваем елемент в левом и правом подмассиве;
                res[arrIndex] = arr1[leftIndex]; //если условие верно, то елемент в левом менъше,
                // сохраняем его в 0 ячейку основного массива
                leftIndex++;
                arrIndex++;
            } else {
                res[arrIndex] = arr2[rightIndex];
                rightIndex++;
                arrIndex++;
            }
        }
// копируем элементы если остались из левого
        while (leftIndex < arr1.length) {
            res[arrIndex] = arr1[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        // копируем элементы из правого
        while (rightIndex < arr2.length) {
            res[arrIndex] = arr2[rightIndex];
            rightIndex++;
            arrIndex++;
        }
        System.out.println(Arrays.toString(res));
        System.out.println(res[k]);
    }

}








/* int[] merge(int[] leftArray, int[] rightArray) {
    int leftLen = leftArray.length;
    int rightLen = rightArray.length;

    int[] target = new int[leftLen + rightLen];
    int targetPos = 0;
    int leftPos = 0;
    int rightPos = 0;

    // As long as both arrays contain elements...
    while (leftPos < leftLen && rightPos < rightLen) {
      // Which one is smaller?
      int leftValue = leftArray[leftPos];
      int rightValue = rightArray[rightPos];
      if (leftValue <= rightValue) {
        target[targetPos++] = leftValue;
        leftPos++;
      } else {
        target[targetPos++] = rightValue;
        rightPos++;
      }
    }
    // Copy the rest
    while (leftPos < leftLen) {
      target[targetPos++] = leftArray[leftPos++];
    }
    while (rightPos < rightLen) {
      target[targetPos++] = rightArray[rightPos++];
    }
    return target;
    */
