import java.util.Comparator;
import java.util.List;

public class Task1 {
    //Дан List<Integer>. Необходимо найти значение элемента максимально близкого к некоторому заданному значению N.
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, -4, 9, -33, 2);

        System.out.println(task1(integerList, -8));
    }

    public static Integer task1(List<Integer> intList, int value) {
        return intList.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - value)))
                .orElse(null);
    }

}
