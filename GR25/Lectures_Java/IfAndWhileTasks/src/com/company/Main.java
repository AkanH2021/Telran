package com.company;

public class Main {
// найдти все четные числа между двумя задаными num1 и num2
    public static void main(String[] args) {
        printNumbers(10, 20);
//
    }

    public static void printNumbers(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        if (min %2 !=0) {
            min+=1;
        }
           while (min <= max) {
            System.out.println(min);
           min+= 2;
        }
    }
}