package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberCharacter("aabbbbccd"));
    }

    ///* Task2**:дана строка: "aabbbbccd" вернутъ строку -> "2a4b2cd"
    public static String numberCharacter(String str) {
        if (str.length() == 0)
            return "";
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (counter > 1) {
                    sb.append(counter).append(str.charAt(i - 1));
                    counter = 1;
                } else {
                    sb.append(str.charAt(i - 1));
                }
            } else {
                counter++;
            }
        }
        if (counter == 1)
            sb.append(str.charAt(str.length() - 1));
        else
            sb.append(counter).append(str.charAt(str.length() - 1));
        return sb.toString();
    }

    /* Task2**:дана строка: "2a4b2cd" вернутъ строку -> "aabbbbccd"    */
    public static String onlyLeters(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digitsCounter = 0;
            while (Character.isDigit(str.charAt(i + digitsCounter))) {
                digitsCounter++;
            }
            if (digitsCounter > 0) {
                int number = Integer.parseInt(str.substring(i, i + digitsCounter));
                i += digitsCounter;

                for (int j = 0; j < number; j++) {
                    sb.append(str.charAt(i));
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
