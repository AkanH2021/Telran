import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("wert");
        strList.add("fdhjkld");
        strList.add("uss");

        System.out.println(strList);
        System.out.println("After method implementation");
        System.out.println(cutLength(strList));
        System.out.println(cutLength1(strList));
        System.out.println(strList);// this shows that in method cutlenght1 we lost 1st original list state;
        transformLongStrings(strList);
        transformLongStrings1(strList);

    }

    public static List<String> cutLength(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        if (stringList == null || stringList.isEmpty()) {
            return stringList;
        }
        for (String str : stringList) {
            if (str.length() <= 4) {
                newList.add(str);
            }
        }
        return newList;
    }

    public static List<String> cutLength1(List<String> stringList) { //wrong method as original list is lost
       if (stringList == null || stringList.isEmpty()) {
            return stringList;
        }
        stringList.removeIf(str -> str.length() > 4);
        return stringList;
    }

    public static void  transformLongStrings(List<String> stringList) { //from teacher
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            if (s.length() > 4) {
                stringList.set(i, s.substring(0, 4));
            }
        }
    }

    public static void transformLongStrings1(List<String> stringList) { //from teacher
       int i= 0;
        for (String s: stringList) {
            if (s.length() > 4) {
                stringList.set(i, s.substring(0, 4));
            }
            i++;
        }
    }

}
