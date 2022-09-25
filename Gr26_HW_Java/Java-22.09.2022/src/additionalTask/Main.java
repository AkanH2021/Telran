package additionalTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
     /*  - "src/main/java/WarAndPeace.txt это ссылка на какой либо текст.
      Необходимо пройти стримом по тексту написать метод который считает количество уникальных слов.
      long count = words.stream().distinct().count();
      И количество повторений long countWithRepeat =тут тоже будет стрим   *//*   тут обработать String contents  *//*
        System.out.println("Слов всего " + countWithRepeat);
        System.out.println("Уникальных слов  " + count);
        P.S. Используйте так же регулярные выражения.
  ********Нужно вывести каждое слово и количество его повторений одним стримом********
        */
    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get("src/additionalTask/testFile.txt"));
        System.out.println(counting((splitting(contents))));
    }

    public static Map<String, Integer> counting (Stream<String> example) {
        return example.collect(Collectors.toMap(k -> k , v->1, Integer::sum));
    }

    private static Stream<String> splitting(String str) {
        return Arrays.stream(str.split("[\\s, ]+"));
    }
}
