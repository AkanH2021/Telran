package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ints = {3, 5, 7, 23, 67};
        task2("aabbbbccd");
        System.out.println(firstToEnd("abcd"));  // ->bcda
        System.out.println(lastToBegin("abcd")); // ->dabc
        System.out.println(isCycle("abc", "cab"));
        System.out.println(isCycle2("abc", "cab"));
    }

    //Task 1**: естъ массив интов. Написатъ метод, которъй возвращает true если в массиве существуют 2 таких числа,
    //произведение которъх равно заданному числу:
    //{3,5,7,23,67} 21 ->true
    //{3,5,7,23,67} 23 -> false


    /* Task2**:дана строка: "aabbbbccd" вернутъ строку -> "2a4b2cd"   */

    public static void task2(String str1) {
        char res = ' ';
        for (int i = 0; i < str1.length(); i++) {
            if (res != (str1.charAt(i))) {
                res+= res;
            }System.out.println(res);
        }
        System.out.println(res);
    }







    ////Task1 from issue34 homework: Даны две строки написать метод, проверяющий образована ли вторая строка сдвигом букв первой строки (abc->cab->bca)
    //    //public static boolean isCycle(String str1, String str2)

    public static String firstToEnd(String str) {
        String str1 = str.substring(1); //берем фактически 2й символ
        String str2 = str.substring(0, 1); //получаем толъко 1ю букву

        return str1 + str2;
    }
    //Task2 from issue34 homework:переставитъ последнюю букву в начло строки (abcd -> dabc). (исполъзоватъ метод substring класс String)
    public static String lastToBegin(String str) {
        String str1 = str.substring(str.length()-1);
        String str2 = str.substring(0,str.length()-1);

        return str1 + str2;
    }

    //Task3 from issue34 homework: Даны две строки написать метод, проверяющий образована ли вторая строка сдвигом букв первой строки (abc->cab->bca)
    //public static boolean isCycle(String str1, String str2)
    public static boolean isCycle(String str1, String str2) {
        if (str1.length() != str2.length()) //делаем проверку длины строк. если не соответствует, сразу даем ошибку
            return false;
        int lenght = str1.length();
        if (lenght == 0) return true;

        for (int i = 0; i < lenght; i++) {
            if (str1.equals(shifted(str2, i))) {
                return true;
            }
        }
        return false;
        }
    public static String shifted(String str2, int shift) {
        return str2.substring(shift)+ str2.substring(0, shift); // str2 = cab -> ab(shift) -> ab+c (abc)

    }

    public static boolean isCycle2(String str1, String str2) {
        String str = str1.concat(str1);  //abcabc

        return str.contains(str2);
    //abc -> cab -> bca
        //abcabc

    }

}
