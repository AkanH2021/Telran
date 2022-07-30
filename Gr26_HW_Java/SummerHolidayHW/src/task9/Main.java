package task9;

import java.util.ArrayList;

public class Main {
    //9.       * Дано целое число n (0<n<8). Требуется вывести все правильные скобочные последовательности длины 2 n. В задаче используются только круглые скобки.
    //2 –> (()) , ()() -> aabb, abab -> iijj, ijij;
    //3 -> ((())), (()()), (())(), ()(()), ()()()  -> aaabbb, aababb, aabbab, abaabb, abaabb, ababab  -> iiijjj,iijijj, iijjij, ijiijj, ijiijj, ijijij
    public static void main(String[] args) {
        ArrayList<String> list = parenthesesGenerating(2);
        System.out.println(list);
    }

    public static void task9(ArrayList<String> strList, int left, int right, char[] str, int index) {
        if (left < 0 || right < left) return;

        if (left == 0 && right == 0) {
            strList.add(String.copyValueOf(str));
        } else {
            str[index] = '(';
            task9(strList, left - 1, right, str, index + 1);

            str[index] = ')';
            task9(strList, left, right - 1, str, index + 1);
        }
    }

    public static ArrayList<String> parenthesesGenerating(int count) {
        char[] str = new char[count * 2];
        ArrayList<String> list = new ArrayList<>();
        task9(list, count, count, str, 0);
        return list;
    }
}