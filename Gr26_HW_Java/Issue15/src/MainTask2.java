import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
/* Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел,
при этом, все слова, короче 4 символов должны идти вначале строки, остальные слова должны сохранить свой порядок. Например:
 {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.  */

        List<String> strList = new ArrayList<>();
        strList.add("The");
        strList.add("homework");
        strList.add("is");
        strList.add("not");
        strList.add("done");
        strList.add("yet");
        strList.add("longword");

        System.out.println(strList);
        System.out.println("After method implementation");

        System.out.println(transformToSingleStrings1(strList, 4));
        System.out.println(transformToSingleStrings2(strList, 4));
        System.out.println(transformToSingleStrings3(strList, 4));
    }

    public static String transformToSingleStrings1(List<String> stringList, int pivot) {    //method 1 (just with StringBuilder usage)
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        if (stringList == null || stringList.isEmpty()) {
            System.out.println(stringList);
        }
        for (String s : stringList) {
            if (s.length() <= pivot)
                left.append(s).append(" ");
            if (s.length() > pivot)
                right.append(s).append(" ");
        }
        return left.append(right).toString();
    }

    public static String transformToSingleStrings2(List<String> stringList, int pivot) { //method 2 (just with String usage)
        String res = "";
        if (stringList == null || stringList.isEmpty())
            return res;
        for (String s : stringList) {
            if (s.length() <= pivot)
                res += s + " ";
        }
        for (String s : stringList) {
            if (s.length() > pivot)
                res += s + " ";
        }
        return res;
    }

    public static String transformToSingleStrings3(List<String> stringList, int pivot) { //method 3 (just with String usage)
        String res = "";
        String left = "";
        String right = "";
        if (stringList == null || stringList.isEmpty())
            return res;
        for (String s : stringList) {
            if (s.length() <= pivot) {
                left += s + " ";
            } else {
                right += s + " ";;
            }
        }
        return res = left + right;
    }
}





