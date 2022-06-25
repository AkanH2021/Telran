import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        printStringNtimes("hello", 6);
        printSquare(4);
        printSquare1(4);
        sumEven(1, 11);
        printPows(6, 100);
        printPows1(6);
        printPows2(6);
        System.out.println(task5(51));
        System.out.println(task5a(51));
        System.out.println(task5b(51));
        System.out.println(task5c(51));
    }

   /* Task 1: Write a method that takes a string (str) and an integer (n). As a result it prints the given String n times
    and puts a number at the beginning each time. And then prints “finish”
    Example: printStringNtimes(“hello”, 3) ->
    2. hello;
    3. hello;
    4.hello; */

    public static void printStringNtimes(String str1, int n) {
        String str2 = "";
        for (int i = 0; i <= n; i++) {
            str2 = (str1);
            System.out.println(i + str2);
            if (i == n) {
                System.out.println("finish");
            }
        }
    }

    /* Taks 2: Write a method that displays a square with * character. The method takes number of characters for a side.
    Example: printSquare(4) ->
    ****
    ****
    ****
    ****  */
    public static void printSquare(int n1) {
        String str = "";
        char ch = '*';

        for (int i = 0; i <= n1 - 1; i++) {
            for (int j = 0; j <= n1; j++) {
                System.out.print(ch);
            }
            System.out.println(str);

        }
        System.out.println("----------------");
    }

    //Task 2: variant 2 from teacher
    public static void printSquare1(int n1) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            System.out.println("i =" +i + "\t");
            for (int j = 0; j < n; j++) {
                System.out.print(j + " ");
            }
        } System.out.println();
    }


    // Task3:Implements the method that return the sum of all even numbers from a to b.
    public static void sumEven(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("----------------");
    }

    //Task4: Implements the method that that takes int and print powers of a given number up to 100.
    //Example: printPows(6) -> 6 12 18 24 30 36 42 48 54 60 66 72 78 84 90 96
    public static void printPows(int n1, int n2) {
        int res = 0;
        for (int i = 0; i <= n2; i++) {
            if (res <= n2) {
                res = res + n1;
                System.out.println(res);
            }
        }
        System.out.println("----------------");
    }

    //Variant2 from teacher:
    public static void printPows1(int n) {
        int res = 0;
        for (int i = 1; res < 100; i++) {
            res = n * i;
            if (res <= 100)
                System.out.println(n * i + "\t");
        }
        System.out.println("----------------");
    }

    //   Variant 3:
    public static void printPows2(int n) {
        for (int i = n; i < 100; i += n) {
            System.out.println(i + "\t");
        }
        System.out.println("----------------");
    }

    // Task5: Count how many times you need to multiply a given number by 2 to get more than 100
    //Example: countMultiplys(12) -> 4 (12*2*2*2*2)
    //countMultiplys(51) -> 1 (51*2)
    //countMultiplys(35) -> 2 (35*2*2)
    //countMultiplys(120) -> 0
    //countMultiplys(-10) -> 0
    //countMultiplys(0) -> 0
    public static int task5(int n1) {
        int count = 0;
        if (n1 <= 0) {
            return 0;
        }
        while (100 / (n1) >= 1) {
            n1 += n1;
            count++;
        }
        return count;
    }

    //Variant 2 from others:
    public static int task5a(int x) {
        int count = 0;
        if (x > 0) {
            int mult = x;
            while (x <= 100) {
                x *= 2;
                count++;
            }
        }
        return count;
    }

    //Variant 3 from others:
    public static int task5b(int n) {
        if (n <= 0 || n > 100) {
            return 0;
        }
        int i;
        int mult = 2;
        for (i = 1; n * mult <= 100; i++) {
            mult *= 2;
        }
        return i;
    }

    ////Variant 4 from others:

    public static int task5c(int n) {
        int count = 0;
        for (int i = n; i < 100 && i > 0; i *= 2) {
            count++;
        }
        return count;
    }
}
