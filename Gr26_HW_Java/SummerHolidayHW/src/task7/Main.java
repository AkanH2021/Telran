package task7;

import java.util.*;

public class Main {
    //7. Есть два списка с буквами. Определить, является ли один список циклической версией другого.
    // Например, для списков {a, b, c, d} и {c, d, a, b} результат будет true,
    //а для {d, e, f} и {d, f, e} - false.
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        List<String> list2 = new ArrayList<>();
        list2.add("c");
        list2.add("d");
        list2.add("a");
        list2.add("b");
        System.out.println(isCycle(list1, list2));
    }

    public static boolean isCycle(List<String> list1, List<String> list2) {
        boolean cycling; // creating boolean with value= "false";
        int startIndex = 0;  //start index will be used later as the start point for comparing arays
        List<String> newList; //new empty List;

        if (list1 == null || list2 == null) {
            System.out.println("Null valued string are entered");
        }
        assert list1 != null;
        assert list2 != null;
        if (list1.size() != list2.size()) {
            System.out.println("Lists are not cycle version of each other");
        }

        newList = new ArrayList<>(list2);  // -> {c, d, a, b} //copy values of list 2 into new array
        newList.addAll(list2); //-> {c, d, a, b, c, d, a, b}  //doubling the values into new array

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {
                if (list1.get(0).equals(newList.get(j)))
                    startIndex = newList.indexOf(newList.get(j));   //->index: 2 -> finding the first occurrence of first symbol from list1 in newList;
            }
        }
        int lastIndex = startIndex + list1.size();  //->index: 6 -> the values between startIndex and lastIndex will be compared, as new partition size == toCheck.size ->(4);

        List<String> toCheck = new ArrayList<>();
        for (int i = startIndex; i < lastIndex; i++) {
            toCheck.add(newList.get(i));
        }
        cycling = list1.equals(toCheck);
        return cycling;
    }
}

