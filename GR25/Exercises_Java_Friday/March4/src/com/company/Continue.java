package com.company;

public class Continue {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i==5) break;
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i <10 ; i++) {
            if (i==5) continue;
            System.out.print(i+" ");
        }
        System.out.println();

        int[][] ints = {{1,4,6,18}, {2,4,5,8, -19}, {12,1,15,8}};

        outerFor:
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length ; j++) {
                if (i==1) continue outerFor;
                System.out.println(ints[i][j]+" ");
            }
            System.out.println();
        }
    }



}
