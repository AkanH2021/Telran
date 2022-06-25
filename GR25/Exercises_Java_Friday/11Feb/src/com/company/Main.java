package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 23, 67};
        System.out.println(isProduct(numbers, 21));
        System.out.println(isProduct1(numbers, 21));
    }

    //  1**.есть массив интов .написать метод который возвращает true если в массиве существуют
// два таких числа произведение которых равно заданному числу
// {3,5,7,23,67}, 21 -> true ;   {3,5,7,23,67}, 23 -> false
    //2** "aabbbbccd"->"2a4b2cd"
    //3** "2a4b2cd"->"aabbbbccd"

    public static boolean isProduct(int[] numbers, int product) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j <= numbers.length - 1; j++) {
                if (numbers[i] * numbers[j] == product)
                    return true;
            }
        }
        return false;
    }

    //решение преподавателя:
    public static boolean isProduct1(int[] numbers, int product) {
        int i = 0;
        int j = numbers.length - 1;


        while (j - i > 0) {
            int localProduct = numbers[i] * numbers[j];
            if (localProduct < product) {
                i++;
            } else if (localProduct > product) {
                j--;
            } else return true;
        }
        return false;
    }
}





