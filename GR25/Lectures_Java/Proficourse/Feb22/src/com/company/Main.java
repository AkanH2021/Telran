package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        biggestAmongThree(3, 6, -12);
    }

    public static void biggestAmongThree(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        }
        if (c > a && c > b) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }
}

