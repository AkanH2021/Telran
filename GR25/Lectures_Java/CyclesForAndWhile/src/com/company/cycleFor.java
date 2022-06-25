package com.company;

public class cycleFor {

    public static void main(String[] args) {
        printDivNumber(6);
        printDivNumber2(6);
    }

    public static void printDivNumber2(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("count = " + count);
    }

    public static void printDivNumber(int number) {
        // 1...number
        int i = 1;
        int count = 0;

        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
                count += 1;
            }
            i++;
        }
        System.out.println("count = " + count);
    }
}



