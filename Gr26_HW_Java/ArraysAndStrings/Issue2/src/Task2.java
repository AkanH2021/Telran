public class Task2 {
    /* Implement the method that counts how many words in the given String. The words are separate by space.
     You have to use only length() and charAt() methods of String class.
“It’s new task for me” -> 5;  */
    public static void main(String[] args) {
        System.out.println(wordsCounter("It’s new task for me"));
    }

    public static int wordsCounter(String str) {
        int counter = 0;
        char ch = ' ';
        if (str==" ") return counter;
        if (str != " ") {
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i))
                    counter++;
            }
        }
        return counter + 1;
        }
}