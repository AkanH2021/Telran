import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(testList(list));
    }

    public static int testList(List<String> list) {
        int counter = 0;
        char ch = 'a';
        list.add("ll");
        list.add("aa");
        list.add("ba");
        list.add("ab");
        for (String s : list) {
            if (s.charAt(0) == (ch))
                counter++;
        }
        return counter;
    }



    }
