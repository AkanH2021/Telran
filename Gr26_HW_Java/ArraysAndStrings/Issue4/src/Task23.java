import java.util.Arrays;

public class Task23 {
    /*  *Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
который вернет массив int состоящий из разрядов этого числа. Например: {1,3,7} -> 137 */
    public static void main(String[] args) {
        long l1 = 137L;
        System.out.println(Arrays.toString(longToArray(137L)));
        System.out.println(Arrays.toString(long2array(137L))); //********from teacher

    }

    public static int[] longToArray(long l1) {
        String str = String.valueOf(l1);
        int length = str.length();
        int[] newArr = new int[length];

        int i = 0;
        while (l1 != 0) {
            newArr[length - i - 1] = (int) (l1 % 10);
            l1 = l1 / 10;
            i++;
        }
        return newArr;
    }

    //********from teacher
    public static int[] long2array(long num) {
        String str = String.valueOf(num);
        int len = String.valueOf(num).length();
        int counter = 1;
        int pow = 10;
        while (num/pow >0) {
            counter++;
            pow = pow*10;
        }
        System.out.println(counter);
        int[] result = new int[counter];

        for (int i = result.length-1; i >=0 ; i--) {
            result[i] = (int) num%10;
            num = num/10;
        }
        return result;
    }

}



