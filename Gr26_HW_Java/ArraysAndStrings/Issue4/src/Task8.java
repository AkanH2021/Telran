public class Task8 {
    /* * Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit находится в диапазоне
     * (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
     * сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
     * Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15. Число 13 не входит.)
     */
    public static void main(String[] args) {
        System.out.println(sum(10, 15, 3));
        System.out.println(sumv2(10, 15, 3));

    }

    public static int sum(int start, int finish, int digit) {
        int res = 0;
        if (digit >= 0 && digit <= 9) {
            for (int i = start; i <= finish; i++) {
                res += i;
                if (i % 10 == digit) {
                    res -= i;
                }
            }
        }
        return res;
    }

    //*********variant from teacher
    public static long sumv2(int start, int finish, int digit) {
        long res = 0;
        digit = (digit >= 0 && digit <= 9)?digit:0;
            for (int i = start; i <= finish; i++) {
                if (i % 10 != digit) {
                res += i;
            }
        }
        return res;
    }
}

