package com.company;

public class OutOfMemoryArraySize {

    public static void main(String[] args) {
        int[] array = new int[Integer.MAX_VALUE];
        System.out.println(array.length);
    }
}
