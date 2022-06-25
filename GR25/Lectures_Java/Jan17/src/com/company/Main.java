package com.company;

public class Main {

    public static void main(String[] args) {
        int n =12474;
        System.out.println(n+" -> "+getDigitsSum(n));
    }

    public static int getDigitsSum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10); //  14567  -7
            n=n/10;        //   1456
        }
        return sum;
    }

}
