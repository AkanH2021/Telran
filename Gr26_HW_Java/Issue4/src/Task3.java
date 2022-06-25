public class Task3 {
/* Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод должен возвращать true
если и первое и второе число делятся без остатка на третье. Подсказка: Используйте метод, написанный в пункте 2*/

    public static void main(String[] args) {
        System.out.println(comparingThreeDigits(15, 50, 1));
    }

    public static boolean comparingThreeDigits(int num1, int num2, int num3) {
        if (num3 == 0) System.out.println("Деление на ноль!!");
        if (num1 % num3 == 0 && num2 % num3 == 0 && num3 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
