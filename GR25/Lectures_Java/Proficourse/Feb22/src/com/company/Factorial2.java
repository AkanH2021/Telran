package com.company;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        do {
            System.out.println("Введите положительное число");
            a= sc.nextInt();
        }while(a<=0);
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Факториал от " + a + " = " + fact);
        sc.close();
    }
}
