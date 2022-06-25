package Task2;
/* Задан лист строк, нужно получитъ лист integer,  в котором содержится длина строк. */

import java.util.ArrayList;
import java.util.List;


public class MainTask2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("yes");
        stringList.add("no");
       // System.out.println(stringList);
        System.out.println(listStringToInt(stringList));
    }

    public static List<Integer> listStringToInt(List<String> stringList) {
        List<Integer> resultLengths = new ArrayList<>();

        if (stringList == null || stringList.isEmpty())
            return resultLengths;

        for (String s : stringList) {
            resultLengths.add(s.length());
        }
        return resultLengths;
        }
    }

