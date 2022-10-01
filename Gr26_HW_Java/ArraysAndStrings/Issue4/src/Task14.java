public class Task14 {
    /*Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
Например: substring(“let’s talk about java”, 7,20) -> “talk about ja” */
    public static void main(String[] args) {
        task14a(" let’s talk about java", 7, 20);
        System.out.println("-----");
        task14b(" let’s talk about java", 7, 20);
    }

    public static void task14a(String str, int start, int finish) {
        System.out.println(str.substring(start, finish));// с исползованием substring;
    }

    public static void task14b(String str, int start, int finish) {
        String strRes = "";
        for (int i = start; i < finish; i++) {   //вариант с использованием цикла for без substring;
            strRes += str.charAt(i);
        }
        System.out.println(strRes);
    }
}




