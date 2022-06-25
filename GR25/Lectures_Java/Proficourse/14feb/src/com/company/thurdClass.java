package com.company;

import java.util.Random;

public class thurdClass {

    public static void main(String[] args) {

        String str1="abc";
        String str2="abcdghjjkl";
        String[] strArray={"qwe","asd", "roybs","asdf"};
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));

        printArr(strArray);
        sort(strArray);
        System.out.println("-------------------------");
        printArr(strArray);
    }

    public static void sort(String[] arr){

        boolean swapFlag=true;
        while (swapFlag) {
            swapFlag=false;
            // i-1   i
            // []   [][][]
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i - 1].compareTo(arr[i])>0) {                // swap a[i] and a[i-1]
                    swapFlag = true;
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }

        }



    }




    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}