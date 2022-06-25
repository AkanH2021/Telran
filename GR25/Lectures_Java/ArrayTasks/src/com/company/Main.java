package com.company;

public class Main {

    public static void main(String[] args) {
        String[] person = {"Olga Sergeeva", "Nikolaev Andrey",
                "Elena Maers", "Nina Umova", "Tarasova Elena"};

        for (int i = 0; i < person.length; i++) {
           String[] words = person[i].split(" ");
           // System.out.print("1:" + words[0]);
            //System.out.println(" 2:" + words[1]);
            // words[1] + " " + words[2];
            print(words);
            System.out.println();
           // String str = person[i];
          //  System.out.println(person[i]);
        }
    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
