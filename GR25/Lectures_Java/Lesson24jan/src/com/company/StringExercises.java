package com.company;

public class StringExercises {
  // "good morning" -> good
//                    morning

    public static void main(String[] args) {
        separation("good morning");
    }

    public static void separation(String str){
        String word= "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ') {
                word+=str.charAt(i);
            } else {
                System.out.println(word);
                word="";
            }
        }
        System.out.println(word);
    }
}
