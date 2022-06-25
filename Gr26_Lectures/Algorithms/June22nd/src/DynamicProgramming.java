import java.util.Arrays;

public class DynamicProgramming {

    public static void main(String[] args) {
        int num = 5;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(fibonacciRecursion(num));
        System.out.println(fibonacciDpMemoization(num, arr));
        System.out.println(fibonacciDpTabulation(num));

    }

    private static int fibonacciRecursion(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        return 0;
    }

    private static int fibonacciDpTabulation(int num) {
       int[] arr = new int[num+1];
       arr[0] = 0;
       arr[1] = 1;

       int res = 0;
        for (int index = 2; index <= num ; index++) {
            arr[index] = arr[index-2 ] + arr[index-1];

            if (index ==num) {
                res = arr[index];
            }
        }
       return res;
    }
}

