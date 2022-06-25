package com.company;

public class MultidimensionalArrays {

                public static void main(String[] args) {
                    int[][] arr ={{1}, {1,3,},{4,5,9}};
                    arr[2][0]=arr[0][0];

                    int [][] arr1 = new int[2][2];
                    int [][] arr2 = new int[6][3];
                    int [][] arr3 = new int[3][];
                    arr3[0]= new int[6];
                    arr3[1]= new int[3];
                    arr3[2]= new int[5];

                    for (int i=0; i<arr.length; i++){
                        for(int j=0; j<arr[i].length;j++){
                            System.out.print("arr["+i+"]["+j+"]="+ arr[i][j]+" ");
                        }
                        System.out.println();
                    }
                }
            }
