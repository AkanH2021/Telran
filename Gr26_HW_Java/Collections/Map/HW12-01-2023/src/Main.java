import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> wordsLIst = fulfillListRandomly();
        System.out.println(wordsLIst);
        System.out.println(everyWordFrequencyCount(wordsLIst));
        System.out.println(maxRepeatedWord(everyWordFrequencyCount(wordsLIst)));
        System.out.println(maxRepeatedWords(everyWordFrequencyCount(wordsLIst)));
    }

    //Из заданного массива слов заполнить ArrayList( 1000 ) случайными словами.
    public static List<String> fulfillListRandomly() {
        String sample;
        int size = 1000;
        List<String> result = new ArrayList<>(size);
        Random r = new Random();
        try {
            sample = Files.readString(Paths.get("src/sample.txt"));
        } catch (IOException e) {
            throw new RuntimeException();
        }
        String[] words = (sample.split("[\\s,]+"));

        for (int i = 0; i < size; i++) {
            result.add(words[r.nextInt(0, words.length)]);
        }
        return result;
    }

    //Подсчитать сколько каждое слово встречается раз в ArrayList
    public static Map<String, Integer> everyWordFrequencyCount(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return new HashMap<>();
        }
        return stringList.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
    }

    //Вывести слово, которое повторяется чаще всего.
    public static Map.Entry<String, Integer> maxRepeatedWord(Map<String, Integer> map) {
        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return maxEntry.orElse(null);
    }

    //Если таких слов несколько - вывести наименьшее из них.
    public static List<String> maxRepeatedWords(Map<String, Integer> map) {
        Integer max = Objects.requireNonNull(map.entrySet()
                        .stream()
                        .min((entry1, entry2) -> entry1.getValue() < entry2.getValue() ? 1 : -1)
                        .orElse(null))
                .getValue();

        return map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), max))
                .min((entry1, entry2) -> entry1.getKey().length() > entry2.getKey().length() ? 1 : -1)
                .map(Map.Entry::getKey)
                .stream().collect(Collectors.toList());
    }
}