import java.util.Arrays;

public class Task19 {
    /* NOT READY!!
    Реализовать метод, который возвращает массив из первых n четных чисел, начиная с заданного числа start.
Например, для заданных n=4, start=21: {22,24,26,28,4} */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstNDigits(4, 21)));
        System.out.println(Arrays.toString(evenNumbers(4, 21)));  //********from teacher
    }

    public static int[] firstNDigits(int size, int start) {
        int[] newArr = new int[size];
        int number = start;
        if (number % 2 != 0) {
            for (int i = 0; i < size; i++) {
                newArr[i] = start + 1;
                start += 2;
            }
        }

        if (number % 2 == 0) {
            for (int i = 0; i < size; i++) {
                newArr[i] = start;
                start += 2;
            }
        }
        return newArr;
    }

    //********from teacher
    public static int[] evenNumbers(int n, int start) {
        if (n < 0) {
            return new int[0];
        }
        int[] result = new int[n];
        if (start % 2 != 0) {
            start++;
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = start;
            start+=2;
        }
        return result;
    }

}







