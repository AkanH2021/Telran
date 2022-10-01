import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    //First level: Реализовать метод который из листа любого типа удаляет дубликаты, при этом сохраняя порядок элементов.
    public static void main(String[] args) {
        List<Integer> intsList = new ArrayList<>();
        intsList.add(5);
        intsList.add(-52);
        intsList.add(22);
        intsList.add(-52);
        System.out.println(removeDuplicates(intsList));

        List<Double> doublesList = new ArrayList<>();
        doublesList.add(5.34);
        doublesList.add(5.34);
        doublesList.add(-52.18);
        doublesList.add(-22.44);
        System.out.println(removeDuplicates(doublesList));

        List<Character> charsList = new ArrayList<>();
        charsList.add('A');   // char Value.at;
        charsList.add('a');
        charsList.add('u');
        charsList.add('a');
        System.out.println(removeDuplicates(charsList));

        List<Byte> bytesList = new ArrayList<>();
        bytesList.add((byte) -38);   // Idea casts to byte
        bytesList.add((byte) 127);
        bytesList.add((byte) -128);
        bytesList.add((byte) 127);
        System.out.println(removeDuplicates(bytesList));

        List<Long> longsList = new ArrayList<>();
        longsList.add(-9223372036854L);
        longsList.add(9223372036854L);
        longsList.add(9223372036854L);
        longsList.add(9223372036854775L);
        System.out.println(removeDuplicates(longsList));

        List<Float> floatsList = new ArrayList<>();
        floatsList.add(-1.456f);
        floatsList.add(-1.456f);
        floatsList.add(7.456f);
        floatsList.add(4.456f);
        System.out.println(removeDuplicates(floatsList));

        List<String> stringsList = new ArrayList<>();   // compares  lexicographically
        stringsList.add("Ivan");
        stringsList.add("Maria");
        stringsList.add("Anna");
        stringsList.add("Ivan");
        stringsList.add("Annamaria");
        stringsList.add("Yuriy");
        stringsList.add("Ivan");
        System.out.println(removeDuplicates(stringsList));
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        if (list.isEmpty() || list == null) {
            System.out.println("List does not contains any value");
        }
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}

