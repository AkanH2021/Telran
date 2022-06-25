import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        stringsCompare("Hello");
        task2();

        System.out.println(task3("Hello", "Hilla"));
        System.out.println(getIndexOfChar("Hello", "hallo"));
        System.out.println(getIndexOfChar2("Hello", "Hi"));
    }
    /* Task1:   Implement a method that prints the given String in reverse order. Solve this task using for.
Example: "Hello" -> "olleH" */
    public static void stringsCompare(String str1) {
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println("    ");
    }

/* Task2:Let your program takes 2 int numbers. If the first number is divisible by the second prints the message  (“num1 is divisible by num2”).
If not the user should input other 2 numbers.  The program should finish if one of the numbers will be 0. */

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        do {
            System.out.println("enter two positive numbers: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        } while (n1 % n2 != 0);

        while (true) {
            if (n1 % n2 == 0 && n1 != 0) {
                System.out.println("num1 is divisible by n2");
            } else {
                System.out.println("Program now will exit (any/all digits null");
            }
            break;
        }
    }

    /* Implement the method that takeы two Strings and as result return the index of the first character that not the same in the both Strings.
        Example: "Hello", “Hi” -> 1;  "Hello", “Hello, and lets start” -> 5; "Hello", “Hello” -> -1;  */
    public static int task3(String s1, String s2) {
        int index = 0;
        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.charAt(i); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    index = 1;
                    break;
                }
            }
        } else if (s1.equals(s2)) {
            return -1;
        } else {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)) index = j;
            }
        }
        return index;
    }

    //VARIANT 2 (correct one from teacher)
    public static int getIndexOfChar(String str1, String str2) {
        int i = 0;
        if (str1.equals(str2)) {
            return 1;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        while (i < len1 && i < len2 && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    //VARIANT 3
    public static int getIndexOfChar2(String str1, String str2) {
        int i = 0;
        if (str1.equals(str2)) {
            return 1;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        for (i = 0; i < len1 && i < len2 && str1.charAt(i) == str2.charAt(i); i++) {
            return i;
        }
        return i;
    }
}
