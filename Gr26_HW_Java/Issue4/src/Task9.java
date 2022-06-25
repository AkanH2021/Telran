public class Task9 {
    /* Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1. Например: find(“let’s talk about java”,’t’) -> 2  */
    public static void main(String[] args) {
        System.out.println(findFirstCharIndex("let’s talk about java", 't'));
    }

    public static int findFirstCharIndex(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                return i;
        }
        return -1;
    }
}
