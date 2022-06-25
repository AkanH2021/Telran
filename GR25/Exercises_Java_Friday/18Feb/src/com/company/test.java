package com.company;

import java.util.Arrays;

public class test {

     public static void main(String[] args) {
            String str1="lipa";
            String str2="pila";
            System.out.println(isAnagram(str1, str2));
        }public static boolean isAnagram(String str1, String str2){
            if (str1.length()!=str2.length())
                return false;
            return sort(str1).equals(sort(str2));
        }
        public static String sort(String str1){
            char[] x=str1.toCharArray();
            Arrays.sort (x);
            return new String(x);
        }
    }

