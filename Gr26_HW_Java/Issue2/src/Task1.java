public class Task1 {
    /* Implement the method that print the String, which consists of given char of the given source string
     and repeated as many times as the given character occurs in the source string
     “It’s new task for me”,’e’ -> “ee”;  */
    public static void main(String[] args) {
        System.out.println(charAtString("It’s new task for me", 'e'));
    }

    public static StringBuilder charAtString(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                sb = sb.append(ch);
        }
        return sb;
    }
}
