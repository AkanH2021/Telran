package com.company;

public class OutOfMemoryHeapCpace {

    public static void main(String[] args) {
        int size = 1_000_000;
        int[] [] array = new    int[size][];
        for (int i = 0; i < size; i++) {
            array[i] = new int[size];
        }
        System.out.println(array.length);
    }



}
