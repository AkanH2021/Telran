public class Main {
    /* 1. Implement a method that prints the given String N times.
printLineNtimes(“hello”,3) -> hello
hello
hello
2. Implement method “countdown” that prints numbers from 5 to 1, than prints „start“
countdown() -> 5
4
3
2
1
Start     */

    public static void main(String[] args) {
        printLineNtimes("hello", 6);
        countdown();
    }

    public static void printLineNtimes(String str1, int n) {
        int a = 0;
        while (a <= n) {
            System.out.println(str1);
            a++;
        }
    }

    public static void countdown() {
        int n = 5;
        while (n <= 5 && n > 0) {
            System.out.println(n);
            n = n - 1;
            if (n == 0)
                System.out.println("hello");
        }
    }
}