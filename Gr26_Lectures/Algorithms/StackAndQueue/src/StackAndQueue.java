import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("empty = " + stack.empty());
        stack.push(10);
        System.out.println("empty = " + stack.empty());
        Integer peek = stack.peek();
        System.out.println("peek = " + peek);
        System.out.println("empty = " + stack.peek());
        System.out.println("empty = " + stack.empty());
        System.out.println("size = " + stack.size());
        Integer pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println("empty = " + stack.empty());
        System.out.println("size = " + stack.size());

        stack.push(10);
        stack.push(11);
        stack.push(12);

        System.out.println(stack.peek());
        System.out.println(stack.search(11));
        System.out.println();
        System.out.println();

        SpecialStack specialStack = new SpecialStack();
        specialStack.push(10);
        specialStack.push(24);
        specialStack.push(36);
        specialStack.push(10);
        System.out.println("min = " + specialStack.getMin());
        specialStack.push(5);
    }

}



