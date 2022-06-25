package com.company;

public class var2 {

    public static void main(String[] args) {
        printNumbers(23, 11);

    }

    public static void printNumbers(int num1, int num2){
        int min , max;
        if (num1>num2){
            min=num2;
            max=num1;
        } else {
            min=num1;
            max=num2;
        }
        if(min%2!=0){
            min+=1;
        }

        while (min<=max){
            System.out.println(min);
            min+=2;
        }
    }
}
