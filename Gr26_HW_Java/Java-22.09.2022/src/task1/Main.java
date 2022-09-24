package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1.1. "apple", "banana", "lemon", "orange" - даны такие слова
        //преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
        //{a=apple, b=banana, l=lemon, o=orange}
        List<String> example = new ArrayList<>();
        example.add("apple");
        example.add("banana");
        example.add("lemon");
        example.add("orange");

        System.out.println(task1(example));
    }

    public static Map<Character, String> task1(List<String> example) {
        return example.stream()
                .collect(Collectors.toMap(v -> v.charAt(0), k -> k));
    }
}