package task5;

import java.util.*;

public class Main_halfReady {
    public static void main(String[] args) {
        //5.      Дана  map <Character, Integer>. Необходимо сформировать случайную строку, где соответствующая буква будет встречаться заданное количество  раз.
        //{A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('A', 2);
        mapa.put('b', 1);
        mapa.put('k', 2);
        mapa.put('c', 3);
        mapa.put(' ', 2);
        System.out.println(randomString(mapa));
    }

    public static String randomString(Map<Character, Integer> mapa) {
        List<Character> keyList = new ArrayList<>(mapa.keySet());  //getting all keys(Characters) into List;
        List<Integer> valueList = new ArrayList<>(mapa.values());  //getting all values(Integers) into List;

             StringBuilder b = new StringBuilder(keyList.size() * 2); //sizes of both Lists(keys and values) in our case are equal;
        for (int i = 0; i < keyList.size(); i++) {  //looping through all keys in List
            for (int j = 0; j < valueList.get(i); j++) {  //Looping through all values in List
                b.append(keyList.get(i)); //adding every key valueList.get(i) == value of Integers times;
            }
        }
        return b.toString();
    }
}
