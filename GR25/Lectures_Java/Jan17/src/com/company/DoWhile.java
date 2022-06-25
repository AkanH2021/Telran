package com.company;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положителное число: ");
           number = sc.nextInt();
        } while (number <= 0);

        System.out.println(number);


    }





}
