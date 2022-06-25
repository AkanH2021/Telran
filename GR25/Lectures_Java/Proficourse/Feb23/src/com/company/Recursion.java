package com.company;

public class Recursion {

    public static void main(String[] args) {
        int f = factorial(1000);
        System.out.println(factorial(5));
    }
    // 5! = 1*2*3*4*5 - произведение всех чисел до данного числа(включителъно)
    //5! = (1*2*3*4)*5 = 4!*5;
    //4! = 1*2*3*4 = 3!*4;
    //1! =1;
    //0!=1

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            int res = n * factorial(n - 1);
            return res;
            // return n * factorial(n - 1);
        }
    }

}