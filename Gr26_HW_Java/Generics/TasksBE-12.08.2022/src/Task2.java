import java.util.ArrayList;
import java.util.List;

public class Task2 {
    //Second level: Реализовать обобщенный метод поиска максимального элемента в любом допустимом листе.
    public static void main(String[] args) {
        List<Integer> intsList = new ArrayList<>();
        intsList.add(5);
        intsList.add(-52);
        intsList.add(22);
        System.out.println(findMax(intsList));

        List<Double> doublesList = new ArrayList<>();
        doublesList.add(5.34);
        doublesList.add(-52.18);
        doublesList.add(-22.44);
        System.out.println(findMax(doublesList));

        List<Character> charsList = new ArrayList<>();
        charsList.add('A');   // char Value.at;
        charsList.add('a');
        charsList.add('u');
        System.out.println(findMax(charsList));

        List<Byte> bytesList = new ArrayList<>();
        bytesList.add((byte) -38);   // Idea casts to byte
        bytesList.add((byte) 127);
        bytesList.add((byte) -128);
        System.out.println(findMax(bytesList));

        List<Long> longsList = new ArrayList<>();
        longsList.add(-9223372036854L);
        longsList.add(9223372036854L);
        longsList.add(9223372036854775L);
        System.out.println(findMax(longsList));

        List<Float> floatsList = new ArrayList<>();
        floatsList.add(-1.456f);
        floatsList.add(7.456f);
        floatsList.add(4.456f);
        System.out.println(findMax(floatsList));

        List<String> stringsList = new ArrayList<>();   // compares  lexicographically
        stringsList.add("Ivan");
        stringsList.add("Maria");
        stringsList.add("Anna");
        stringsList.add("Annamaria");
        stringsList.add("Yura");
        System.out.println(findMax(stringsList));

        System.out.println(max(stringsList));

    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        T maxVal = list.get(0);
        for (T val : list) {
            if (val.compareTo(maxVal) > 0)
                maxVal = val;
        }
        return maxVal;
    }

    public static <T extends Comparable<T>> T max(List<T> list) {  //from teacher
        T max = null;
        for (T s : list) {
            if ((max == null) || s.compareTo(max) > 0) {
                max = s;
            }
        }
        return max;
    }

}
