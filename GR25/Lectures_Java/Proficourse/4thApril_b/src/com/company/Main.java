package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Vasya", "Pupkin", 123);
        Person p2 = new Person("Vasya", "Pupkin", 123);

       if (p1==p2) {
            System.out.println("ето один Вася");
        }
        else {
            System.out.println("ето разнъе Васи");
        }
        System.out.println("equals");
        if (p1.equals(p2)) {
            System.out.println("ето один Вася");
        } else {
            System.out.println("ето разнъе Васи");
        }

        System.out.println("---------String-------");
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("---------==-------");
        if (str1.equals(str2)) {
            System.out.println("ето одинаковъе стринги");
        } else {
            System.out.println("ето разнъе стринги");
        }

        System.out.println("---------equals-------");
        if (str1==str2) {
            System.out.println("\"ето одинаковъе стринги");
        } else {
            System.out.println("ето разнъе стринги");
        }



        DemoClass demoClass = new DemoClass(10,20);
        System.out.println(demoClass.getMax());

        demoClass.setStr1("hello");
        demoClass.setStr2("hello");

    }





}

