package transformer;

public class Main {
    public static void main(String[] args) {


    String input = "aaa BBBb cDvCn ddddddddd";

    TransformToUpper toUpperCase = new TransformToUpper();
    System.out.println(transformer(input, toUpperCase));

    TransformToLower toLowerCase = new TransformToLower();
    System.out.println(transformer(input, toLowerCase));

    TransformToStars toStars = new TransformToStars();
    System.out.println(transformer(input, toStars));

    }
    //Дана строка, состоящая из нескольких слов разделенных пробелом.
    // Написать метод, позволяющий изменять слова в строке так:
    // при длине слова = 3, изменить все буквы слова на заглавные
    // при длине слова = 4, изменить все буквы слова на строчные
    // при длине слова = 5, изменить все буквы слова на звездочки
    // "aaa bbbb BBBb ccc dddddd dRgHd"

    public static String transformer(String string1, WordsTransformer trans1) {

        String[] words = string1.split(" "); // split разбивает строку на основе того, что следует после символа

        for (int i = 0; i < words.length; i++) {
            if (trans1.check(words[i])) {
                words[i] = trans1.transform(words[i]);
            }
        }
        return String.join(" ", words);     // join соединяет (обратно методу split)
    }

}
