public class test {

    public static void main(String[] args) {
        printEachChar("Hello");
    }


    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print("[" + str.charAt(i) + "]");
        }

    }
}