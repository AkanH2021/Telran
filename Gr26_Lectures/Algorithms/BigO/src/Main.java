public class Main {
    public static void main(String[] args) {
// 1 единицу времени на арифметические и логические операции
// 1 единицу времени на операторъ присваивания и на return

        int n = 8;
        for (int i = 1; i <=n ; i++) { // O(n)  - линейная зависимостъ - 7 раз възъваем i (печатаем слово "Hello")
            System.out.println("Hello");   //О(1) - Константнъй порядок роста
        }
    }

    public static int sum(int one, int two) {
        int result = one + two; // арифм. операция присваивания и сложения (2 операции), значит: О(2);   cost = 2
        return result; // просто return - 1 операция О(1);  cost = 1
    }

    //время (Тsum) = 2(строка 13) +1(строка 14) = 3
    //О(3) -> O(1)
    //4n^3 = O(n^3)
    //n^2 + 2 = O(n^2)
    //log2(n), log10(n) = O(log(n));

    public static int listSum(int[] array) {
        int result = 0;  //cost = 1  times = 1;
        for (int i = 0; i < array.length; i++) {  // cost = 3   times = n + 1 times, стоимостъ n неизвестна рпедварителъно
            result = result + array[i]; // cost = 2, times = n
        }
        return result;   //cost = 1, times = 1 (т.к. возвращаем 1 раз етот result

    }
//    (Тsum) = 1 + 3*(n+1) + 2*n + 1   =    3n + 3 + 2 + 2*n = 3n + 5 + 2*n = 5 + (3+2)n = 5 + 5n;

    public static void fork(int n) {
        if (n<5) {
            System.out.println("number < 5"); //best O(1)
        } else{
            for (int i = 0; i < n; i++) {
                System.out.println(i+ " "); // worst = O(n)
            }
        }
    }
    public static void bubleFor(int n) {
        for (int i = 0; i <=n /3; i++) {  //O(n/3)
            for (int j = 1; j <= n ; j+=4) {    //O(n/4)
                System.out.println("I study Big O notation");
            }

        }
    }
    //for = O(n) for = O(n) -> O(n^2)
}