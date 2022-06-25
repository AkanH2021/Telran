import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /* Написатъ диспенсер для банкомата. Он выдает деньги, у него есть некоторое количество кассет, в которые загружаются
    купюры разного номинала. при запросе въдаются разные купюры, но они могут и заканчиваться.
   Подсказка: можно осоздать массив или переменные с номиналами и их количеством;
    пользователь задает сумму, а банкомат выдает купюры соответно запросу.
     */
    public static void main(String[] args) {
        banking();

         }
    public static void banking() {
       int[] banknotes = {10,20,50,100};
       int[] summBancnotes = {85, 85, 85,85};
       int[] totalSum = new int[4];

       for (int i = 0; i < banknotes.length; i++) {
            for (int j = 0; j < summBancnotes.length; j++) {
                totalSum[i] = banknotes[i] * summBancnotes[j];




            }System.out.println(Arrays.toString(totalSum));
        }
       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the desired amount: ");
     //   int intDesiredSum = sc.nextInt();



    }
}
