public class Task12 {
    /* Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
символов начиная с конца одинаковые у обеих строк. */
    public static void main(String[] args) {
        System.out.println(postfixes("paragliders", "paraplaners"));
        System.out.println(postfixes1("paragliders", "paraplaners"));
        System.out.println(lengthPostfix("paragliders", "paraplaners"));
    }

    public static int postfixes(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int count = 0;
        for (int i = minLength - 1; i > 0; i--) {
               if (str1.charAt(i) == str2.charAt(i)) {
                count++;
            }
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
        }
        return count;
    }

    public static int postfixes1(String str1, String str2) {
        int minLength = str1.length();
        if (str1.length()>str2.length()) {
            minLength = str2.length();
        }
        int count = 0;
        for (int i = minLength - 1; i > 0; i--) {
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

    //********variant from teacher:
    public static int lengthPostfix(String str1, String str2) {
        int i1 = str1.length()-1;
        int i2 = str2.length()-1;
        int count = 0;

        while (i1>=0 && i2>=0 && str1.charAt(i1)==str2.charAt(i2)) {
            i1--;
            i2--;
            count++;
        }
        return count;
    }
}
