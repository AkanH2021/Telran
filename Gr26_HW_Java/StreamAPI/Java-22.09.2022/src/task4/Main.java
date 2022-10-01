package task4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    /*  - "src/main/java/WarAndPeace.txt это ссылка на какой либо текст.
      Необходимо пройти стримом по тексту написать метод который считает количество уникальных слов.
      long count = words.stream().distinct().count();
      И количество повторений long countWithRepeat =тут тоже будет стрим   *//*   тут обработать String contents  *//*
        System.out.println("Слов всего " + countWithRepeat);
        System.out.println("Уникальных слов  " + count);
        P.S. Используйте так же регулярные выражения.*/
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("src/task4/testFile.txt")), StandardCharsets.UTF_8);

        System.out.println("Слов всего " + countWithRepeat(contents));
        System.out.println("Уникальных слов  " + count(contents));
    }

    public static long count(String str) {
        String[] words = str.split("[\\s,]+");
        return Arrays.stream(words)
                .flatMap(s -> Arrays.stream(words))
                .distinct()
                .count();
    }

    public static long countWithRepeat(String str) {
        String[] words = str.split("[\\s,]+");
        return Arrays.stream(words)
                .count();
    }
}


