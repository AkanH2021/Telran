package com.company;

public class LessonCode {





    public static void main(String[] args) {
        System.out.println(14%4);
        String s1="hello";
        String s2="hello";
        //(s1==s2) -> s2.equals(s1)
        int lenS1 =s1.length();
        System.out.println("length of s1 is " + lenS1);


        int temp1= getTemperature1();
        int temp2= getTemperature2();

        System.out.println("Temperature 1 is " + temp1);
        System.out.println("Temperature 2 is " + temp2);
        System.out.println("The temperatures are correct - " + check2(temp1,temp2));
    }
    public static boolean check(int temperature1, int temperature2){
        if(temperature1>100 || temperature2>100){
            return true;
        }
        return false;
    }


    public static boolean check2(int temperature1, int temperature2){
        if (temperature1 > 100 ^ temperature2 > 100) {
            return true;
        }
        return false;
    }

    public static boolean check3(int temperature1, int temperature2){
        boolean condition= (temperature1 > 100 && temperature2 < 100) ||
                (temperature2 > 100 && temperature1 < 100);

        if (condition){
            return true;
        }
        return false;
    }

    public static boolean check4(int temperature1, int temperature2){
        return (temperature1 > 100 && temperature2 < 100) ||
                (temperature2 > 100 && temperature1 < 100);
    }



    public static int getTemperature1(){
        return 0;
    }
    public static int getTemperature2(){
        return 120;
    }


}

/*
          0 - correct
          1 - temperature 1 is low, temperature2 is ok
          2- temperature 2 is low, temperature1 is ok
          2- temperature 1 is low, temperature2 is low

         */