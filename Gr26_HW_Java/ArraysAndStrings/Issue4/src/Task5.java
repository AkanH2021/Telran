public class Task5 {
    /* Реализовать метод String longestString (String str1, String str2, String str2) который
    возвращает самую длинную строку из трех заданных строк:
    Подсказка: Используйте метод, написанный в пункте 4
    Например: longestString (“java”,”welcome”,”hello”) -> “welcome” */
    public static void main(String[] args) {
        System.out.println(longestString("java", "welcome", "hello"));
        System.out.println(longestStringv2("java", "welcome", "hello"));
    }

    public static String longestString(String str1, String str2, String str3) {
        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            return str1;
        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            return str2;
        } else return str3;
    }

    // variant from teacher**************
    public static String longestStringv2(String str1, String str2, String str3) {
        String max = (str1.length()>str2.length())?str1:str2;
        return (max.length()>str3.length())?max:str3;

    }
}
