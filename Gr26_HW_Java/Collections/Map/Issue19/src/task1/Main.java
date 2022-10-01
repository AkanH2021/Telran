package task1;

import java.util.*;

public class Main {
    /* 1)    Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’, то нужно  создать новый ключ ‘ab’ с суммой значений от ключей a и b.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"} */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");

        String strKey1 = map.get("a");   //Method1
        String strKey2 = map.get("b");
        String strResKey = strKey1.concat(strKey2);

        if (!strResKey.isEmpty()) {
            map.put(strResKey, String.valueOf(map.keySet()));
        }
        System.out.println(map);

        System.out.println(task1a(map));
    }

    public static Map<StringBuilder, Collection<String>> task1a(Map<String, String> map) { //method 2
        Map<StringBuilder, Collection<String>> resMap = new HashMap<>();
        Collection<String> values = map.values();
        StringBuilder resKey = new StringBuilder();
        for (String v : values) {
            resKey.append(v);
            resMap.put(resKey, map.values());
        }
        return resMap;
    }
}