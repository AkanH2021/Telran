package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeCharacter(" abcd", 'b'));
        //   codeCaesar("Hello", 5);
        swapWithoutBuffer(2, 3);
        //   numberOfVowelsAndConsonants("Hello World");
        // stringsCompare("Hello World");
    }

    //1. написатъ метод, убирающий заданную букву из строки
    //public static String removeCharacter(String str, char ch) {
    public static String removeCharacter(String str, char ch) {
        if (str == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch)
                sb.append(str.charAt(i));
        }
        return new String(sb);
    }

    public static String codeCaesar(String code) {
        String coded = "";
        int lastCharValue = 'z';  //122
        int alphabetLenght = 'z' - 'a' + 1; //a=097 находим длинну алфавита
        System.out.println("alphabetLenght=" + alphabetLenght);
        System.out.println("lastCahrValue=");

        for (char character : code.toCharArray()) {
            int charNoRotation = character + 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLenght;

            //int a = c<d?:d
            coded += (char) charValue;
        }
        return coded;
    }

    public static void swapWithoutBuffer(int a, int b) { //a = 2, b = 3
        a = a + b;  // 2+3
        b = a - b;  // 2+3-3 = 2
        a = a - b;  // 2+3-2 = 3
        System.out.println("a now is " + a + " , b now is " + b);
    }

 /*   public static void numberOfVowelsAndConsonants(String string) {
        int cons = 0;
        int vows = 0;
        Character[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p','q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < consonants.length-1; i++) {
            if (consonants[i].equals(string.charAt(i))) {
                cons+= 1;
                if (vowels[i] == string.charAt(i)) {
                    vows+= 1;
                }
            }
            System.out.println("cons" + cons + " vows" + vows);

        }

    }  */

    //from teacher
    public static void numberOfVowelsAndConsonants1(String string) {
        int counterVowel = 0;
        int counterConsonants = 0;

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isLetter(character)) {
                if (
                        character == 'a' ||
                                character == 'u' ||
                                character == 'o' ||
                                character == 'e' ||
                                character == 'i' ||
                                character == 'y'
                ) counterVowel++;
                else counterConsonants++;
            }
        }
        System.out.println(counterVowel);
        System.out.println(counterConsonants);
    }

    public static void stringsCompare(String str1) {
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }

    }

    public String reverseWords(String string) {
        String[] words = string.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i > 0; i--) {
            res = res.append(words[i]).append(" ");
        }
        return new String(res);
    }
}



