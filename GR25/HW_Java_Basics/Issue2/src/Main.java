/* Try to find on your keyboard the specials symbols: “ [ ] { } ( ) & * ^ ~ - + _ : ; “” \ / | ”. You should be able to find these symbols quite quickly.
   Implement the program that prints to screen “I think: “Java is easy.” ”
   Implement the program that prints to screen the result:
    a) 33+43+53
    b) “I’m” + “a” + “programmer”. All words should be spitted by space. */

public class Main {

    public static void main(String[] args) {
        System.out.println("I think: \"Java is easy\" ");
        //end of 1st homework
        System.out.println(33 + 43 + 53);
        System.out.println("33+43+53");
        //end of 2nd homework
        String a = "I'm";
        String b = "a";
        String c = "programmer";
        String d = " ";
        System.out.println(a + d + b + d + c);
        //end of 3rd homework variation1
        System.out.println("I'm" + d + "a" + d + "programmer");
        //end of 3rd homework variation2
    }
}
