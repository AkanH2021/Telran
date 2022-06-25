public class Task2 {
    /* 2. Write a method that takes a String and displays the words in column and in brackets. You have to use only
     length() and charAt() methods of String class.
The words are separated with char a space; For example: “I always do my homework” -> [I]
[always]
[do]
[my]
[homework]  */
    public static void main(String[] args) {
        task2("I always do my homework");
    }
    public static void task2(String str1){
        String str2="[";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                System.out.println(str2+"]");
                str2="[";
            }else{
                str2=str2+str1.charAt(i);
            }
        }
        System.out.println(str2+"]");
    }

}
