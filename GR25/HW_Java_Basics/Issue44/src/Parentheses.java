public class Parentheses {

    public static void main(String[] args) {
        //Implement the previous task «check parentheses» based on the fact that
        // brackets can be of different types: () [] {}
        //"9*(8+3)-( (9+1)5)" -> true
        //"9(8+3)- (9+1)5)" -> false
        //"98+3)-( (9+1)*5" -> false

        String str = "[1(2)3]";//"{ ([(98+3)-) }]( (9+1)*5)";
        char[] openBrackets = {'(', '[', '{'};
        char[] closeBrackets = {')', ']', '}'};
        System.out.println(checkParentheses(str,openBrackets,closeBrackets));
    }
    ///      ( hhs []kkk} )     ->

    public static boolean checkParentheses(String str,char[] openBrackets, char[] closeBrackets){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int bracketIndex= getIndexOfBracket(ch,openBrackets);
            if(bracketIndex!=-1){
                sb.append(closeBrackets[bracketIndex]);
                continue;
            }
            bracketIndex= getIndexOfBracket(ch,closeBrackets);
            if(bracketIndex!=-1){
                if (sb.length()==0 || sb.charAt(sb.length()-1)!= closeBrackets[bracketIndex]){
                    return false;
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.length()==0;
    }
    public static int getIndexOfBracket(char ch, char[] brackets){
        for (int i = 0; i < brackets.length ; i++) {
            if (ch==brackets[i]) return i;
        }
        return -1;
    }

}
