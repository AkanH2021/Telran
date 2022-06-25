package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MyDate d1 = new MyDate(25,4,2019);
        MyDate d2 = new MyDate(20,1,2020);
        MyDate d3 = new MyDate(25,2,2019);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("1st date is "+ ((d1.compareTo(d2)>1)? " bigger":" less"));

        MyDate[] dates = new MyDate[] {d1,d2,d3};
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));
    }
}
