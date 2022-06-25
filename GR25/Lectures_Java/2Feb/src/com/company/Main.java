package com.company;

public class Main {

    public static void main(String[] args) {
        makeSubString("Hello Java", 4, 7);
        String str = ("I always doo my homework hihi");
        System.out.println(makeNewString("I always do my homework"));
    }


    public static String makeSubString(String str, int indexStart, int indexEnd) {
        if (indexStart < 0 || indexStart >= str.length() || indexEnd < 0 || indexEnd >= str.length())
            return "OutOfBoundException!";
        String res = "";

        int[] arr = new int[10]; // or int[] arr = {1,2,3,4} -если хотим задатъ уже значения внутри массива(1,2,3,4 и т.д)
        int[] arr2 = new int[10]; // цифра 10 внутри означает 10 ЕЛЕМЕНТОВ! а не одна цифра.

        StringBuffer st = new StringBuffer("123456"); // то же самое как и обявление int или String: int i; String str1; и т.д.
        String str1 = new String("123456");  // так же можно создаватъ новый стринг


        for (int i = indexStart; i < indexEnd; i++) {
            // res +=str.charAt(i);
            st.append(str.charAt(i));
        }
        return st.toString(); // эта команда превращает StringBuilder обратно в класс String
        // String -> StringBuilder -> toString обычно получаем на входе Стринг, в программе многократно изменяем его, превратив в
        //   StringBuilder, и в конце программы обратно превращаем в String
        // return res;
    }

    //дана строка "I always do my homework" - нужен метод, которъй сформирует новую строку, которая состоит из слов, которъе
    // короче 3х символов
    // 1) ищем слова ( пробел определяет конец или начало слова) -> нужен цикл
    // 1.1 перебираем все символъ строки
    //1.2. на каждом шаге: если нет пробела, накапливаем слово
    //1.3. если естъ пробел, обрабатъваем накопленное слово -> шаг 2 (накапливаем новое слово )
    // 2) проверяем слово на длину (по условие длина <3 символов)
    // 3) если слово подходит, то формируем резулътат

    public static String makeNewString(String str) {
        StringBuilder res = new StringBuilder();                 //накапливает обший резулътат
        StringBuilder word = new StringBuilder();       // накапливает слово
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || i == str.length() - 1) {                //если встевчаем пробел
                if (i == str.length()-1)  word.append(ch);
                if (word.length() <= 3) {
                    if (ch== ' ') word.append(ch);
                    res.append(word);
                }
                word = new StringBuilder();
            } else {
            word.append(ch);
            }
        }
        return res.toString();
    }
}



