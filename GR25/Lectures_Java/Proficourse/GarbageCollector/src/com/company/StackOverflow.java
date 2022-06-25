package com.company;

public class StackOverflow {
    private static int count = 0;

    public static void main(String[] args) {
    //    f0();
        f8();
    }

    private static void f0() {
        System.out.println(count++);
        f0();
    }

    private static void f8(){
        int a = 0, b = 0, c = 0, d= 0, e = 0, f = 0, g = 0, k = 0;
        System.out.println(count++);
        f8();
    }

  //  private static void f8(int a, int b, int d, int e, int f, int g, int k){
   //     int a0 = a++, b0 = b++, c0 = c++, d0= d++, e0 = e++, f0 = f++, g0 = g++, k0 = k++;
   //     System.out.println(count++);
     //   f8(a0, b0, c0, d0, e0,f0, g0, k0);
    }



