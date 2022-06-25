import java.util.Arrays;

public class LessonB {
    /* реализуйте свой собственный метод разделения. Он должен разбивать заданную строку вокруг совпадений разделителя
    символов. В результате он должен возвращать массив подстрок. Не испольуйте метод String.split, например:
    ("Java очень проста!", 'v')  -> {"Java", "очень", "проста"}
    ("Java is very easy!", 'v') -> {"Ja", "a is", "ery easy"}
    ("Java is very easy!", '!') -> {"Java is very easy"}
    ("Java is very easy!", ':') -> {"Java  - это очень просто!"}
     */
    public static void main(String[] args) {
        String str = "Hel1lo Java";
        String[] result = split(str, '1');

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

        System.out.println(Arrays.toString(split("Java очень проста!", ' ')));
        System.out.println(Arrays.toString(split("Java is very easy!", 'v')));
        System.out.println(Arrays.toString(split("Java is very easy!", '!')));
        System.out.println(Arrays.toString(split("Java is very easy!", ':')));
    }

    public static String[] split(String str, char delimiter) {
        String[] temp = new String[countChars(str, delimiter) + 1];
        String word = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != delimiter) {
                word = word + ch;
            } else {
                if (!word.isEmpty()) {
                    temp[index] = word;
                    index++;
                    word = "";
                }
            }
            if (!word.isEmpty()) {
                temp[index] = word;
                index++;
            }

        }
        return temp;
    }

    public static int countChars(String str, char ch) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }
        }
        return result;
    }
}

