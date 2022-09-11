package hw8thSeptember;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    /*  4. Дан список строк «Иванов Иван Иванович: 645» Сформировать отсортированный по числовому полю список строк вида:
     «645:Иванов И.И.»,
    при этом отобрать только те строки, где числовое поле больше 500.*/
    public static void main(String[] args) {

        String s1 = "Ivanov Ivan Ivanovich: 645";
        String s2 = "Ivanova Maria Ivanovna: 685";
        String s3 = "Korolev Sergey Pavlovich: 550";
        String s4 = "Pavlov Ivan Petrovich: 445";
        String s5 = "Mendeleev Dmitry Ivanovich: 345";

        List<String> namesList = List.of(s1, s2, s3, s4, s5);

        System.out.println(task4HW(namesList));
    }

    public static List<String> task4HW(List<String> namesList) {
        List<String> resList = namesList.stream()
                .map(str -> str.split(" "))
                .filter(str -> Integer.parseInt(str[str.length-1]) > 500)
                .sorted(Comparator.comparingInt(str -> Integer.parseInt(str[str.length - 1])))
                .map(str -> str[str.length - 1] + ":" + str[0] + " "
                        + str[1].charAt(0) + "." + str[2].charAt(0) + ".")
                .collect(Collectors.toList());
        return resList;
    }
}