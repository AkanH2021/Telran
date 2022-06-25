import java.util.Arrays;

public class Task4 {
    /* NOT READY!!  Implement your own split method. It should break a given string around matches of the char delimiter.
    As a result it should return array of substrings. Don’t use the String.split method
For example:
(“Java is very easy!”, ’ ‘) -> {“Java”,”is”,”very”,”easy”}
(“Java is very easy!”, ’v‘) -> {“Ja”,“a is”,”ery easy”}
(“Java is very easy!”,’!‘) -> {“Java is very easy”}
(“Java is very easy!”,’:‘) -> {“Java is very easy!”}   */
    public static void main(String[] args) {
        System.out.println(splitter("Java is very easy!", ' '));
    }

    public static String splitter(String str, char delimiter){
        String [] newArr = new String[countChars(str, delimiter)+1];
       String word = "";
       int index = 0;

       for (int i = 0; i < str.length(); i++) {
           char  ch = str.charAt(i);
           if (ch!=delimiter) {
               word = word + ch;
           } else {
               newArr[index] = word;
               index++;
               word="";
           }
        }
            return Arrays.toString(newArr);
    }

    public static int countChars(String str, char ch) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }
        } return result;
    }
}
