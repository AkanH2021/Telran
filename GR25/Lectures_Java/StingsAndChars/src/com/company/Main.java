package com.company;

public class Main {
//сделатъ метод, которъй въводит сколъко раз
// какой то символ встречается в данном стринге
    public static void main(String[] args) {
        System.out.println(charRepeat("good morning", 'o'));
        System.out.println(charRepeat1("Hello, Elena", 'e'));
    }

//перебираем строку по символам
//проверяем каждъй символ
// если символ не соответствует, то шаг 2
//если соответствует то увеличитъ счетчик резулътата.

    public static int charRepeat(String str, char ch) {
        int count =0;
        for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i)==ch)  {
             count++;
         }
        }
        return count;
    }

// дана строка. Въвести заданнъй символ которъй встречается в заданной строке:
    //"hello", 'l' -> "ll"
    //"hello, lena", 'l' -> "lll"

    public static String  charRepeat1(String str, char ch) {
        String rez= "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch) {
                rez+=ch;
            }
        }
        return rez;
    }

}

