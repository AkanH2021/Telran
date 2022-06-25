public class Task10 {
    /*Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 15 */
    public static void main(String[] args) {
        System.out.println(findLastCharIndex("let’s talk about java", 't'));
    }

    public static int findLastCharIndex(String str, char ch){
        for (int i = str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)==ch)
                return i;
        }
        return -1;
    }
}
