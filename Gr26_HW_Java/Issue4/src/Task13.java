public class Task13 {
  /*Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]  */
  public static void main(String[] args) {
      squareBracketsPrint("Hello");

      System.out.println();
      printCharsInBrackets("Hello"); //*** variant from teacher

  }

  public static void squareBracketsPrint (String str1) {
      for (int i = 0; i < str1.length() ; i++) {
          System.out.print("[" + str1.charAt(i)+"]");
      }
  }

  //****variant from teacher
    public static void  printCharsInBrackets(String str){
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(addBrackets(str.charAt(i)));
        }
        System.out.println();
    }
    //****variant from teacher
public static String addBrackets(char ch) {
      return "("+ch+")";
}

}
