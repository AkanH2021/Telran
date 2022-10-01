import java.util.ArrayList;
import java.util.List;

public class MainTask1 {
    public static void main(String[] args) {
/* Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел.
Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.  */

        List<String> strList = new ArrayList<>();
        strList.add("I");
        strList.add("do");
        strList.add("my");
        strList.add("homework");
        strList.add("every");
        strList.add("day");

        System.out.println(strList);
        System.out.println("After method implementation");
        transformToSingleStrings(strList);
        transformToSingleStrings1(strList);
        System.out.println(transformLongStrings2(strList));

    }

    public static void transformToSingleStrings(List<String> stringList) {    //method 1
        StringBuilder res = new StringBuilder();
        if (stringList == null || stringList.isEmpty()) {
            System.out.println(stringList);
        }
        for (String s : stringList) {
            res.append(s).append(" ");
        }
        System.out.println(res);
    }

    public static void transformToSingleStrings1(List<String> stringList) {   //method 2
        if (stringList == null || stringList.isEmpty()) {
            System.out.println(stringList);
        }
        String srt = stringList.toString().replaceAll("[\\[\\],]", "");
        System.out.println(srt);
    }

    public static String transformLongStrings2(List<String> stringList) {  //Method 3
        String res = "";
        if (stringList == null || stringList.isEmpty())
            return res;
                for (String s : stringList) {
            res += s;
            res += " ";
        }
        return res;
    }
 }

