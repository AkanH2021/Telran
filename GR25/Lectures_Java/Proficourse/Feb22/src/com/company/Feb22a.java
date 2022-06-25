package com.company;

import java.util.Scanner;

public class Feb22a {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(),
                b=sc.nextInt(),
                c=sc.nextInt();

        int d=b*b-4*a*c;
        if(d>0){
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));
        }else if (d==0){
            System.out.println((-b)/(2*a));
        }else{
            System.out.println("решений нет");
        }
        sc.close();
    }



}
