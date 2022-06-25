public class Main {
    //Recursion and Stack
    public static void main(String[] args) {
        System.out.println(funIteration(5));
        System.out.println(funRecursion(1));


        //метод подсчета согласнъх букв: countConsonant;
        //метод которъй проверяет букву: согласная или нет isConsonant (char letter): boolean
        System.out.println(countConsonantIteration("AaBb 1"));
        System.out.println(countConsonantRecursion("AaBb 1", "AaBb 1".length()));
    }

    public static int countConsonantIteration(String str) {
int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isCOnsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isCOnsonant(char letter) {
        letter = Character.toUpperCase(letter);
        if (letter >= 65 && letter <=90 && (letter == 'A' || letter =='E' || letter == 'O'
        || letter == 'U' || letter == 'I')) {
            return true;
        } return false;

    }

    //через рекурсию
    public static int countConsonantRecursion(String str, int n) {
        int res = 0;
        if (n == 1) {
            res = isCOnsonant(str.charAt(0)) ? 1 : 0;
            System.out.println("now res = " + res);
        }
        if (isCOnsonant(str.charAt(n-1))) {
            res = countConsonantRecursion(str, n-1) + 1;
        } else {
            res = countConsonantRecursion(str, n-1);
        }
        return res;
    }


    private static int funIteration(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
        }
        return res;
    }

    private static int funRecursion(int n) {
        if (n == 1) {
            System.out.println(" n = " + n);
            return 1;

        }
        int fun = funRecursion(n - 1);
        int res = n + fun;
        System.out.println("res = " + res + "; n = " + n);
        return res;
    }


}
