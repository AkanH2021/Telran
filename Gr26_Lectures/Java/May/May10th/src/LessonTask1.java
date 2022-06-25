public class LessonTask1 {
    /*Реализоватъ метод, которъй в качестве параметров получает 3 числа типа int. Метод должен возвращатъ true если
    и первое и второе число делятся без остатка на третъе.
    Подсказка: исполъзуйте метод из задачи про divisible;
     */
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 8;
        int n3 = 3;
        System.out.println(threeDigits(n1, n2, n3));
    }

    public static boolean threeDigits(int n1, int n2, int n3) {
        if ((n3!=0) && (n1%n3==0) && (n2%n3==0)) {
            return true;
        }
        return false;
    }
}
