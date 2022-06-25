import java.util.LinkedList;
import java.util.List;

public class Stack {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);



        System.out.println(list);
    }


    public static boolean checkBrackets(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            switch (ch) {
                case '{' : stack.push('}');break;
                case  '(' : stack.push(')');break;
                case '[':stack.push(']');break;
                case '}':
                case ')' :
                case ']':
                if (stack.empty() ||stack.pop().charValue()!=ch.charValue())
                    return false;

            }
        }
       return stack.empty();
    }


}
