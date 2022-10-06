package task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    //    Дана строка (для простоты можно считать,  слова разделены одним пробелом и строка не содержит знаков препинание и т.д.).
//    Используя стрим, получить map<String, Integer> где ключ – слово, значение – сколько раз это слово встречается в строке.
    public static void main(String[] args) {
        String example = "Jack room 10 Nick room 20 Jack room 1 Mike room 3";
        System.out.println(task1a(example));

        System.out.println(task1b(example));
    }

    public static Map<String, Integer> task1a(String str) { //variant with forEach loop usage
        Map<String, Integer> map = new HashMap<>();
        String[] res = str.split(" ");
        for (String s : res) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public static Map<String, Integer> task1b(String str) { //variant with stream usage
        String[] res = str.split(" ");
        return Arrays.stream(res).collect(
                Collectors.toMap(
                s -> s,
                s -> 1, Integer::sum));
    }
}
