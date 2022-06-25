public class Main {
    /* Реализоватъ метод boolean isEven(int number) которъй возвращает true если переданное число
    четное, иначе возвращает false. Реализоватъ метод void printCheckResultMessage(int number, boolean result)
    которъй въводит на екран строку вида "10 ето четное число" или "15 ето нечетное число".
    Подсказка: Изполъзуем конструкцию if и оператор modulo
     */
    public static void main(String[] args) {
        int num= 11;
       printCheckResultMessage(num,isEven(num));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
        //if (number % 2 == 0) {
        //            return true;
        //        } else {
        //            return false;
        //        }
    }

    public static void printCheckResultMessage(int number, boolean result) {
   /*     if (result==true){
            System.out.println(number+ " ето четное число");
        }else {
            System.out.println(number+ " ето нечетное число");
        } */
        //with ternary operator:
        System.out.println((result) ? (number + " ето четное число") : (number + " ето нечетное число"));

    }
}
