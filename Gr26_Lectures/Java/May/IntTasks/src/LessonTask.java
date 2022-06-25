public class LessonTask {
    /* Реализоватъ метод boolean isDivisible(int num1, int num2) которъй возвращает true если  number1 делится на
    number2 без остатка. Аналогично 1й задаче реализоватъ метод печати резулътата.
         */
    public static void main(String[] args) {
    int number1 = 16;
    int number2 = 5;
    printCheckResultMessage(number1, number2, isDivisible(number1, number2));
    }

    public static boolean isDivisible(int num1, int num2) {
     return (num2!=0) && (num1 % num2 == 0);
    }

    public static void printCheckResultMessage(int number1, int number2, boolean result) {
    /*    if (result == true) {
            System.out.println("number1 делится на number2 без остатка");
        } else {
            System.out.println("number1 делится на number2 с остатком");
        }  */
    System.out.println((result)? (number1 + " делится на " +number2 + " без остатка"):( number1 + " делится на " +number2+ " с остатком"));
    }

}



