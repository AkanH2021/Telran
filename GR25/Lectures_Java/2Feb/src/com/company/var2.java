package com.company;

public class var2 {

/*
1) ищем слова
    перебираем все символы строки
    на каждом шаге, если не проел то накапливаем слово
                    если пробе -> обрабатываем накопленное слово -> шаг 2
                                  начинаем накапливать новое слово

2) проверям слово длина < 3
3) если слово подходит -> формируем результат

 */

     public static void main(String[] args) {
            String str = "I always doo my homework hihi";
            System.out.println(makeNewString(str));
        }


        public static String makeNewString(String str){
            StringBuilder res = new StringBuilder();
            StringBuilder word= new StringBuilder();
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if (ch!=' '){
                    word.append(ch);
                } else {
                    if (word.length() <=3){
                        res.append(word);
                    }
                    word = new StringBuilder();
                }

            }

            return res.toString();
        }

    }

