package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //3.Path path = Paths.get(путьдофайла);
//Прочитать все строки текстового файла и объединить их в одну строку
    public static void main(String[] args) throws IOException {

        System.out.println(task3());

    }

    public static String task3() throws IOException {
        Path path = Paths.get("src/task3/testFile.txt");
        try (Stream<String> lines = Files.lines(path)) {
            return lines.collect(Collectors.joining("\n"));
        }
    }
}
