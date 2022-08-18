package task9;

public class Solution3 {
    public static void main(String[] args) {

        int n = 4;
        solution(n * 2, "", 0);
    }

    public static void solution(int n, String s, int openBrackets) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        if (n > s.length() + openBrackets) {
            solution(n, s + "(", openBrackets + 1);
        }
        if (openBrackets > 0) {
            solution(n, s + ")", openBrackets - 1);
        }
    }
}
