package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //4. Анагра́мма — строка, составленная путем перестановки букв исходной строки, например “ABB CAA“ - “BA BCAA“ -> “CBA BAA“ ……
        //В задаче дано 2 строки из символов латинского алфавита и пробелов, нужно определить, являются ли они анаграммами. Если знаете, предложите несколько
        //алгоритмов\подходов к решению данной задачи.

        String str1 = "ABB CAA";
        String str2 = "BA BCAA";
        // String str1 = null; //for checking exception work;
        System.out.println(anagramCheck1(str1, str2));
        System.out.println(anagramCheck2(str1, str2));

    }

    public static boolean anagramCheck1(String str1, String str2) {  //Method 1
        List<Character> list1 = new ArrayList<>();
        if ((str1 == null) || (str2 == null)) {
            System.out.println("one or both strings are null");
        }
        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.toUpperCase().charAt(i));
            list1.sort(Character::compareTo);
        }
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.toUpperCase().charAt(i));
            list2.sort(Character::compareTo);
        }
        return list1.equals(list2);
    }

    public static boolean anagramCheck2(String str1, String str2) {  //Method 2
        Map<Character, String> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        if ((str1 == null) || (str2 == null)) {
            System.out.println("one or both strings are null");
        }
        assert str1 != null;
        String newStr1 = str1.toLowerCase();
        assert str2 != null;
        String newStr2 = str2.toLowerCase();

        for (int i = 0; i < newStr1.length(); i++) {
            map1.put(newStr1.charAt(i), str1);  //String as value: just to keep the original String str1
        }
        for (int i = 0; i < newStr2.length(); i++) {
            map2.put(newStr2.charAt(i), str2);  //String as value: just to keep the original String str2
        }
        return map1.keySet().equals(map2.keySet());
    }
}
