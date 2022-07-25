package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Дан отсортированный лист Integer. Необходимо удалить из него все дубликаты.
        //{6,6,8,9,14,15,15,15,20} -> {6,8,9,14,15,20}
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(15);
        list.add(20);
        System.out.println(duplicateRemoval(list));
    }

    public static List<Integer> duplicateRemoval(List<Integer> list) {
        if (!list.isEmpty() && list != null) {
            Set<Integer> resultSet = new TreeSet<>(list);
            return new ArrayList<>(resultSet);
        } else {
            return list;
        }
    }
}