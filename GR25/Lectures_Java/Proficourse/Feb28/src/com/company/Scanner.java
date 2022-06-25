package com.company;

public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.println("Input number:");
        int a = scanner.nextInt();

        System.out.println("The given number is: " + a);
        int b = scanner.nextInt();

        System.out.println("The sum of numbers is: " + (a+b));

    }

}
