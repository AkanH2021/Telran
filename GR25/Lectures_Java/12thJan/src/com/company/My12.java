package com.company;

public class My12 {

    public static void main(String[] args) {
        xremainings(12, 53);
    }

    public static void xremainings(int n1, int n2) {
        int x = 0;
        if (((n1 - n2) % 2 == 0) || ((n2 - n1) % 2 == 0)) {

            while ((x > n1) || (x < n1) || x > n2 || x < n2) {
                System.out.println(x);
            x++; }
        }
    }
}

