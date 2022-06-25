public class Main {
    /*Implement the program that prints to screen the results of addition, subtraction, multiplication and
    division of two numbers. Each of the arithmetic operations should be implemented as a separate method.   */

    public static void main(String[] args) {
        definition();
        addition();
        substraction();
        multiplication();
        division();
    }

    public static void definition() {
        System.out.println("a = 10");
        System.out.println("b = 5");
    }

    public static void addition() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println("Value of our variable addition a+b=" + c);
    }

    public static void substraction() {
        int a = 10;
        int b = 5;
        int c = a - b;
        System.out.println("Value of our variable substraction a-b=" + c);
    }

    public static void multiplication() {
        int a = 10;
        int b = 5;
        int c = a * b;
        System.out.println("Value of our variable multiplication a*b=" + c);
    }

    public static void division() {
        int a = 10;
        int b = 5;
        int c = a / b;
        System.out.println("Value of our variable division a/b=" + c);
    }
}
