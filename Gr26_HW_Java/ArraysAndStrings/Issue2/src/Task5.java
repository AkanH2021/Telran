public class Task5 {
    /* Given arrays String[]. Implement the method that returns the shortest String from it.  */
    public static void main(String[] args) {
        String[] newArr = new String[]{"Implement", "the", "method", "that"};
        System.out.println(shortestString(newArr));
    }

    public static String shortestString(String[] stringArr) {
        String shortest = stringArr[0];
        for (int i = 0; i < stringArr.length; i++) {
            if (shortest.length() > stringArr[i].length()) {
                shortest = stringArr[i];
            }
        }
        return shortest;
    }
}
