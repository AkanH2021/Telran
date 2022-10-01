public class Task11 {
    /* Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
символов начиная с начала одинаковые у обеих строк. */
    public static void main(String[] args) {
        System.out.println(prefixes("paraglide", "paraplaner"));
        System.out.println(lengthPrefix("paraglide", "paraplaner"));
        System.out.println(lengthPrefixPrint("paraglide", "paraplaner"));
    }

    public static int prefixes(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int count = 0;
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 == ch2) {
                count++;
            }
            if (ch1 != ch2) {
                break;
            }
        }
        return count;
    }

    //*********variant from teacher
    public static int lengthPrefix(String str1, String str2) {
        int i = 0;
        while (i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)) {
            i++;
        }
       return i;
    }

    //*********variant from teacher with printing the prefix:
    public static String lengthPrefixPrint(String str1, String str2) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)) {
            result.append(str1.charAt(i));
            i++;
        }
        return result.toString();
    }
}