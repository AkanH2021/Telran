public class Task20 {
    /*Дано два массива char одинаковой длинны. Написать метод, который выводит все символы,
которые совпадают и имеют одинаковые индексы и в первом и во втором массиве.
Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc */
    public static void main(String[] args) {
        char[] charArr1 = new char[]{'a', 'b', 'c', 'd', 'g', 'e', 'j'};
        char[] charArr2 = new char[]{'d', 'b', 'c', 'f', 'g', 'j', 'e'};

     //   charCompare(charArr1, charArr2);
        printSameElements(charArr1, charArr2);
    }

    public static void charCompare(char[] chars1, char[] chars2) {
        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                for (int j = 0; j < chars2.length; j++) {
                    if (chars1[i] == chars2[j] && i == j) {
                        System.out.print(chars1[i]);
                    }
                }
            }
        }
    }

    //********from teacher
    public static void printSameElements(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==arr2[i]) {
                System.out.print(arr1[i]);
            }
        }
    }

}
