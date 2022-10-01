public class Task2 {
/*Реализовать метод boolean isDivisible(int number1, int number2) который возвращает true если number1 делится
    на number2 без остатка. Аналогично первой задаче реализовать метод печати результата. */

    public static void main(String[] args) {
        System.out.println(isDivisible(20, 7));
        printCheckResultDivisible(-22, 1, true);
    }
    public static boolean isDivisible(int number1, int number2) {
        if (number1 % number2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printCheckResultDivisible(int number1, int number2, boolean result) {
        if (number2 == 0) System.out.println("Деление на ноль!!");
     if (number2 !=0 && (number1 % number2 == 0) && (result == true)) {
            System.out.println(number1 + " делится на " + number2 + " без остатка");
                    }
       else if (number2 !=0 && (number1 % number2 != 0 ) && (result == false)){
            System.out.println(number1 + " делится на " + number2 + " с остатком");
        }
        else {
            System.out.println("boolean задан неверно");
            //если число1 делится на число2 без остатка - boolean = true, если с остатком - boolean = false;
        }
    }
}


