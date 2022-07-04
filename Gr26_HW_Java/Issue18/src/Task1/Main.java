package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Дан список String. Необходимо получить список уникальных строк из исходного списка,
        //которые состоят не менее чем из двух слов (слова разделены пробелом)
        String st1 = "Guten morgen!";
        String st2 = "Guten";
        String st3 = "Guten morgen";
        String st4 = "Guten morgen, mein name ist";
        String st5 = "Guten morgen, mein name ist";
        String st6 = "Guten morgen, mein name ist nicht!";

        List<String> stringList = new ArrayList<>();
        stringList.add(st1);
        stringList.add(st2);
        stringList.add(st3);
        stringList.add(st4);
        stringList.add(st5);
        stringList.add(st6);

        System.out.println(twoWorldsAndMore(stringList));
    }

    public static HashSet<String> twoWorldsAndMore(List<String> list) {
        HashSet<String> stringSet = new HashSet<>();
        for (String str : list) {
            String[] q = str.split(" ");
            int len = q.length;
            if (len >= 2)
                stringSet.add(str);
        }
        return stringSet;
    }
}

