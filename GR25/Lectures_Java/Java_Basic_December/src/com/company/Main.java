package com.company;

public class Main {

    public static void main(String[] args) {
        int salaryP = 100;
        int urlaubP = 10;
        int urlaubJ = 11;
        int salaryJ = 110;

        int total = payments(salaryP, urlaubP) +
                payments(salaryJ, urlaubJ);
        System.out.println(total);
    }
    public static int payments(int yearSalary, int urlaubSalary) {
       return yearSalary + urlaubSalary;

    }


}
