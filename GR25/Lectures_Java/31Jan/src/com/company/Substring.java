package com.company;

import java.util.Locale;

public class Substring {

    public static void main(String[] args) {
        String str = "qwerr";
        str.length();
        str.charAt(0);
        str.equals("");  // ==
        String str1 = str.replace('r', 'R');
        System.out.println(str.replace('q', 'Q'));
        System.out.println(str1);
        System.out.println(str.replace("qw", "iu"));
        System.out.println(str);

        str1 = str.toUpperCase();
        System.out.println(str1);
        String temp ="Hello Java";
        System.out.println(temp.substring(6));
        System.out.println(temp.substring(0,5));

        String new1 = "asdfg".substring(3,-2);
        System.out.println(new1);

        char[] strArray = str.toCharArray();

        int a = 2;
    }


}
