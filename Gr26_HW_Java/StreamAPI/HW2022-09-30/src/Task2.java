import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    /*2. Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50", "Jack:1300.20"....
    Необходимо получить Map<String, Double> где ключ это имя, а значение - сумма выплат.
    Пример:  ("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}*/
    public static void main(String[] args) {
        List<String> stringList = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");

        System.out.println(task2(stringList));

    }

    public static Map<String, Double> task2(List<String> stringList) {
        double start = 0.0;
        return stringList.stream().collect(Collectors.
                groupingBy((String str) -> str.split(":")[0],
                Collectors.mapping((String str) -> Double.
                                parseDouble(str.split(":")[1]),
                        Collectors.reducing(start, Double::sum))));
    }

}

