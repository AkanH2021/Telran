import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) {
        /*
        mergeSort(arr) - method that sorts arr[] using marge()
        merge(arr, leftArr, rightArr) - merge two subarrays of arr[]
         */

        int[] arr = {15, 21, 13, 5, 10, 7};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length; // ������ �������
        if(lengthArr == 1) { // ������� ������
            return;
        }

        int mid = lengthArr / 2;
        int[] leftArr = new int[mid]; // ����� ���������
        int[] rightArr = new int[lengthArr - mid]; // ������ ���������

        // �������� �������� �� ������� � ����������
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = 0; j < lengthArr - mid; j++) {
            rightArr[j] = arr[j + mid];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        // ����� �� �������� �������� �������
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;

        // ������������ ������� �����������
        int leftIndex = 0;
        int rightIndex = 0;

        // ������������ ������ � �������� �������
        int arrIndex = 0;

        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) { // ���������� ������� � ����� � ������ ����������
                arr[arrIndex] = leftArr[leftIndex]; // ���� ������� �����, �� ������� � ����� ������, ��������� ���
                // � 0 ������ ��������� �������
                leftIndex++;
                arrIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
                arrIndex++;
            }
        }

        // �������� �������� ���� �������� �� ������
        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        // �������� �������� �� �������
        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}
