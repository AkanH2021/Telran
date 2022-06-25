package com.company;

public class var3 {

    public static void main(String[] args) {
        getNumberBetween(23, 11);
    }

    public static void getNumberBetween(int n1, int n2) {
        if (n1 < n2) {
            int i = n1;
            while (i <= n2) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i = i + 1; // i++ // i+=1 // ++i
            }
        }

        if (n1 > n2) {
            int i = n2;
            while (i <= n1) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        if (n1 == n2) {
            System.out.println("");
        }
    }
}

