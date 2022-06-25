package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = {5, 1, 6, 4, 9, 8, 3};
        int[] ints1 = {5, 9, 6, 4, 9, 8, 3};
        int[] ints2 = {1,1,1,1};

        find2Largest(ints);
        find2Largest(ints1);
        find2Largest(ints2);

        Student student = new Student();
        student.name = "Petr";
        student.number = 2;

        printStudent(student);

    }

    //display second max element of int array
    public static void find2Largest(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i]!=arr[arr.length-1]) {
                System.out.println("The second largest element is " + arr[i]);
            return;
            }
        }
        System.out.println("There  is no second largest element");
    }

    //display smallest and second smallest without sorting the array
    public static void secondMinElt(int[] array) {
        int firstMinElement;
        int secondMinElement;

        firstMinElement = array[0];
        secondMinElement = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if ((array[i]) < firstMinElement) {
                firstMinElement=array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < secondMinElement &&array[i] != firstMinElement) {
                secondMinElement = array[i];
            }
        }
        if (secondMinElement == Integer.MAX_VALUE)
            System.out.println("No second smallest element");
        else
            System.out.println("The smallest element is " + firstMinElement + "and second min is " + secondMinElement);
    }

    public static int findSingle(int[] numbers) {
        //5,5,3,3,2   5^5^3^3^2
        int res = 0;
        for (int num: numbers) {
            res^= num;
        }
        return  res;
    }


    //1. create class named "Student" containing variable String 'name' and integer variable 'number'
  //  Assign the value of number = 2 and value of  name is "Petr" by creating an object of the class Student.
    public static void printStudent(Student student) {
        System.out.println(student.name);
        System.out.println("number : " + student.name);

    }
}
