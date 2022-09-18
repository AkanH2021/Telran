import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //Сгруппируйте слова с одинаковым набором символов.
    static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        String[] words = {"student", "dog", "students", "god", "cat", "act", "flow", "wolf"};
        printSameCharWord(words);
    }

    public static void printSameCharWord(String[] words) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            String key = getHashCode(words[i]);
            if (map.containsKey(key)) {
                ArrayList<Integer> tempList = map.get(key);
                tempList.add(i);
                map.put(key, tempList);
            } else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(i);
                map.put(key, newList);
            }
        }
        for (Map.Entry<String, ArrayList<Integer>> m : map.entrySet()) {
            ArrayList<Integer> getValue = m.getValue();
            for (Integer value : getValue) {
                System.out.print(words[value] + ", ");
            }
            System.out.println();
        }
    }

    public static String getHashCode(String str) {
        boolean[] visited = new boolean[MAX_CHAR];
        Arrays.fill(visited, false);

        for (int i = 0; i < str.length(); i++) {
            visited[str.charAt(i) - 'a'] = true;
        }
        StringBuilder key = new StringBuilder();
        for (int j = 0; j < MAX_CHAR; j++) {
            if (visited[j]) {
                key.append('a' + j);
            }
        }
        return key.toString();
    }
}