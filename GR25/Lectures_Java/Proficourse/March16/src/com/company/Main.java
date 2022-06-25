package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "{";
        String s2 = "}";
        System.out.println(strTransform("Hello", s1, s2));

    }

    public static String strTransform(String str, String s1, String s2) {
     String s = s1+" "+" "+s2;
        return String.format("%s %s 5%s",  s2, str, s1);
    }
}
