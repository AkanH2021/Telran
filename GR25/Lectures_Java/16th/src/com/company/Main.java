package com.company;

public class Main {

    public static void main(String[] args) {
        int cod=doSomething();
        System.out.println("Код равен: " + cod);
        System.out.println("Это означает: " + stroki(cod));
    }
    public static int doSomething(){
        return 404;

    }
    public static String stroki(int a){
        if (a==200) {
            return "Код корректна";
        }
        if (a==404) {
            return "Страница не найдена";
        }
        if (a==505) {
            return "Ошибка метода";
        }
        return "Error";
    }

}
