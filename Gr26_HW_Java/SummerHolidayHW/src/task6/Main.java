package task6;

import java.util.*;

public class Main {
    //6. Дана  map <Character, Set<String>> где значение – список строк начинающихся на букву, которая является ключом. Увы, исходный map содержи ошибки.
    //Несколько строк записаны в неправильные ключи. Написать метод, который скорректирует map.
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        strSet1.add("arbuz");
        strSet1.add("arahis");
        Set<String> strSet2 = new HashSet<>();
        strSet2.add("brokolli");
        strSet2.add("baklajan");
        Set<String> strSet3 = new HashSet<>();
        strSet3.add("grusha");
        strSet3.add("yabloko");
        strSet3.add("citron");
        strSet3.add("ccc");
        Map<Character, Set<String>> mapa = new HashMap<>();
        mapa.put('a', strSet1);
        mapa.put('b', strSet2);
        mapa.put('c', strSet3);

        System.out.println(mapa);
        correction(mapa);
        System.out.println(mapa);

        mapCheckAndCorrect(mapa);


    }

    public static void correction(Map<Character, Set<String>> wrongMap) {

        for (Map.Entry<Character, Set<String>> entry : wrongMap.entrySet()) {
            setCheck(entry.getKey(), entry.getValue());
        }
    }

    public static void setCheck(Character ch, Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().charAt(0) != ch) {
                iterator.remove();
            }
        }
    }

    public static void mapCheckAndCorrect(Map<Character, Set<String>> map) { //from teacher
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            Set<String> values = map.get(key);
            System.out.println(values);
            Iterator<String> iterator = values.iterator();
            while (iterator.hasNext()) {
                String value = iterator.next();
                if (value.charAt(0) != key) {
                    addValue(map, value);
                    iterator.remove();
                }
            }
        }
    }

    private static void addValue(Map<Character, Set<String>> map, String value) {  //from teacher
        if (value != null && !value.isEmpty()) {
            Character key = value.charAt(0);
            Set<String> set = map.getOrDefault(key, new HashSet<>());
            set.add(value);
            map.put(key, set);

        }
    }
}
