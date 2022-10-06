import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    /* 1. Дан список строк вида "a:11", "b:22", "a:13".... Необходимо получить Map<String, List<Integer>>
    где ключ это символ, а значение - список цифровых значений соответствующих символу.
    Пример:   ("a:11", "b:22", "a:13", "c:20", "a:10") -> {a=[11, 13, 10], b=[22], c=[20]}  */
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<String> stringList = List.of("a:11", "b:22", "a:13", "c:20", "a:10");

        System.out.println(task1((stringList)));

    }

    public static Map<String, List<Integer>> task1(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(str -> str.split(":")[0],
                        Collectors.mapping(s -> Integer.parseInt(s.split(":")[1]),
                                Collectors.toList())));
    }
}


