public class Main {

    public static void main(String[] args) {
        task1("Hello Java", 4, 7);
        printPrimeNumbers(4, 20);
        System.out.println("--------------");
        //  task3(10);
        task4Trial("1234321");
    }
    //Task1: Implements your own substring method, that works the same like Java String’s substring.
    //Do not use Java substring method! :-)
    //substring(“Hello Java”,4,7) ->”o J”

    public static void task1(String str1, int index1, int index2) {
        for (int i = 0; i <= str1.length(); i++) {
            if (i == index1 || i == index2) {
                System.out.println(str1.charAt(i));
            }
        }
        System.out.println("-----------");
    }

    //Task2: Write the method printPrimeNumbers(int start, int finish) that displays the prime
    //(https://en.wikipedia.org/wiki/Prime_number) numbers within a range of numbers.
    //Example: printPrimeNumbers(4, 20) -> 5
    //7
    //11
    //13
    //17
    //19

    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //Task 3:Implement a method that return an array that contains the first n terms of the Fibonacci sequence
    //For example: (10) -> {1,1,2,3,5,8,13,21,34,55}

    public static void task3(int length) {
        int[] fibNumbers = new int[10];
        for (int i = 2; i <= fibNumbers.length - 1; i++) {
            if (fibNumbers[i] == fibNumbers[i - 2] + fibNumbers[i - 1]) {
                System.out.println(fibNumbers[length]);
            }
        }
    }

    //Task 4: write the method that check if the given String is palindrome (https://en.wikipedia.org/wiki/Palindrome
    //isPolindrome(“1234321”) -> true
    //isPolindrome(“hello”) -> false

    public static void task4Trial(String str1) {
        String temp = "";
        char[] characters = str1.toCharArray();
        for( int i = characters.length - 1 ; i >= 0 ; i-- ) {
            temp = temp + characters[i];
        }
        if (str1.equals(temp)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}
