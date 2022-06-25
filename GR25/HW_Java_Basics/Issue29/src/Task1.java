public class Task1 {
    /* 1. Write a method that takes a String and two chars. As the result it returns the given String, where each the
    first char was replaced by the second char. You have to use only length() and charAt() methods of String class.
For example: “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework” */
    public static void main(String[] args) {
        task1("I always do my homework", 'a', 'A');
    }

    public static void task1(String str1, char ch1, char ch2) {
        String str2 = "";
        for (int i = 0; i <= str1.length() - 1; i++) {
            if (str1.charAt(i) == ch1) {
                str2 = str2 + ch2;
            }else
                str2 += str1.charAt(i);
        }
        System.out.println(str2);
    }
}
