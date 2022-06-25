public class Task1 {
/* Реализовать метод boolean isEven(int number) который возвращает true если переданное число четное иначе
возвращает false. Реализовать метод void printCheckResultMessage(int number, boolean result) который выводит на
 экран строку вида «10 это четное число» или “15 это не четное число»
    Подсказка: Используем конструкцию if и оператор % modulo */

    public static void main(String[] args) {
        System.out.println(isEven(18));
        printCheckResultMessage(18, true);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printCheckResultMessage(int number, boolean result) {
        if ((number % 2 == 0 && result) == true) {
            System.out.println(number + " это четное число");
        } else if (number % 2 != 0 && result == false) {
            System.out.println(number + " это не четное число");
        } else {
            System.out.println("boolean задан неверно");
            //если число четное - boolean = true, если число нечетное - boolean = false;
        }
    }
}
