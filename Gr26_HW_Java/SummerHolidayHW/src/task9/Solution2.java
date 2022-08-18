package task9;

public class Solution2 {
    public static void main(String[] args) {

        solution(6);
    }

    public static void solution(int n) {  //from teacher
        n = n * 2;
        int num1 = (int) Math.pow(2, n - 1);
        int num2 = (int) Math.pow(2, n);
        for (int i = num1; i < num2; i += 2) {
            String binary = Integer.toBinaryString(i);
            if (check(binary)) {
                System.out.println(toBracketsString(binary));
            }
        }
    }

    public static boolean check(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter = (str.charAt(i) == '1') ? counter + 1 : counter - 1;
            if (counter < 0) return false;
        }
        return counter == 0;
    }

    public static String toBracketsString(String str) {
        return str.replaceAll("1", "(")
                .replaceAll("0", ")");
    }

}
