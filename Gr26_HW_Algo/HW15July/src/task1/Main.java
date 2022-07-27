package task1;

public class Main {
    public static void main(String[] args) {
/* 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
     решение 1 - рекурсивно O(n)
     решение 2 - улучшить решение 1 до O(log n)   */
        System.out.println(powRecursive(5, 3));
        System.out.println(iterativePow(5, 3));
        System.out.println(powimproved(5, 3));
        otherMethod(5, 3);
        System.out.println(iterative(5, 3));

    }

    public static int powRecursive(int x, int pow) {  //With recursion
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return x;
        } else {
            return x * powRecursive(x, pow - 1);
        }
    }

    public static int powimproved(int x, int pow) { //Time Complexity: O(log n)
        int res = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                res *= x;
            }
            x *= x;
            pow >>= 1;
        }
        return res;
    }

    public static int iterativePow(int x, int pow) { //Time Complexity: O(1)
        return (int) Math.pow(x, pow);
    }

    public static void otherMethod(int x, int pow) {     //Time Complexity: O(log n)
        int n = pow;
        int tempx = x;
        int result = 1;

        while (n > 0) {
//          If n is an even number then multiply X with  itself  and make n as half of it.
            if (n % 2 == 0) {
                tempx *= tempx;
                n = n / 2;
            }
//          If n is an odd number then multiply result with X and reduce n by 1(one).
            else {
                result *= tempx;
                n--;
            }
        }
        System.out.println("The value of  " + x + " by power " + pow + "  is " + result);
    }

    public static int iterative(int x, int pow) { //Time Complexity: O(n)
        int result = 1;
        if (pow == 1) {
            return x;
        }
        for (int i = 1; i <= pow; i++) {
            result = result * x;
        }
        return result;
    }
}