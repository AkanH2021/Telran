import java.util.Arrays;
import java.util.Optional;

public class Task2 {
    //Дана строка вида ключ1:значение1;ключ2:значение2;ключ1:значение2;ключ3:значение1 .....
// Написать метод, который возвращает последнее значение заданного ключа.
//Например: "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3", "Jack" -> "room 1"
//Если в строке нет заданного ключа возвращается пустая строка.
    public static void main(String[] args) {
        String example = "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3";

        task2(example, "Jack");
        task2(example, "Jac");
        task2(example, "Jacky");
    }

    public static Optional<String> task2(String str, String key) {
        String[] transformed1 = str.split(";");
        System.out.println(Arrays.stream(transformed1)
                .filter(s -> s != null && s.substring(0, str.indexOf(":")).equalsIgnoreCase(key))
                .reduce((i1, i2) -> i2));
        return Optional.empty();
    }
}