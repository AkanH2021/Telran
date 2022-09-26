package additionalTask;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     /*  -Задание из task 4 -> дополнительное условие:
  ********Нужно вывести каждое слово и количество его повторений одним стримом********
        */
    public static void main(String[] args) throws IOException {
        String contents = "src/main/java/WarAndPease.txt это ссылка на какой либо текст.\n" +
" Необходимо прости стримом по тексту написать метод который считает количество уникальных слов.\n" +
" long count = words.stream().distinct().count();\n" +
" И количество повторений long countWithRepeat =тут тоже будет стрим   *//*    тут обработать String contents *//* \n" +
" System.out.println(\"Слов всего \" + countWithRepeat);\n" +
" System.out.println(\"Уникальных слов  \" + count);\n" +
" P|S Используйте так же регулярные выражения.*/";
                System.out.println(counting((splitting(contents))));
    }

    public static Map<String, Integer> counting (Stream<String> example) {
        return example.collect(Collectors.toMap(k -> k , v->1, Integer::sum));
    }

    private static Stream<String> splitting(String str) {
        return Arrays.stream(str.split("[\\s,]+"));
    }
}
