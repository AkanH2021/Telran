import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /* 1. Дан лист Integer. Необходимо написать метод, который возвращает лист аналогичный заданному, но "перевернутый" задом на перед.
        (1, 4,2,9) ->(9,2,4,1) */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(9);

        System.out.println("ArrayList before reverse");
        System.out.println(numbers);

        System.out.println("ArrayList after reverse(Method 1 - simple printout):");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();

        System.out.println("ArrayList after reverse(Method 2 - with new ArrayList creation):");
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            newArrayList.add(numbers.get(i));
        }
        System.out.println(newArrayList);

        System.out.println(getNewReversedList(numbers));
        revers(numbers);
    }

    //from teacher
    public static List<Integer> getNewReversedList(List<Integer> list) {
        List<Integer> res = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

    //from teacher 2
    public static void revers(List<Integer> list) {
        int right = list.size()-1;
        int left =0;
        while(left<right) {
            Integer temp = list.get(right);  //swap (right, left)
            list.set(right, list.get(left));
            list.set(left, temp);
            left++;
            right--;
        }
        System.out.println(list);

    }

}
