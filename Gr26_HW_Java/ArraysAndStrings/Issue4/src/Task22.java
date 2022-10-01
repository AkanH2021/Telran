import java.util.Arrays;

public class Task22 {
    /* Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
заданного массива; Например: {1,3,7} -> 137 */
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 7};
        System.out.println(arrToLong1(arr1));
        arrToLong(arr1);
        System.out.println(array2long(arr1));
    }

    public static long arrToLong1(int[] array) {   //var1
        long l = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 0) && (array[i] <= 9)) {
                sb.append(array[i]);
                l = Long.valueOf(String.valueOf(sb));
            }
        }
        return l;
    }

    public static void arrToLong(int[] array) {   //var2
        long l1 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 0) && (array[i] <= 9)) {
                if (array[i] >= 0 && array[i] <= 9) {
                    Long l = (long) array[i];
                    System.out.print(l);
                }
            }
        }
    }

    //********from teacher
    //Например: {1,3,7,4} -> 1374
    // 1374 = 1*10^3 + 3*10^2 + 7*10^1 + 4*10^0 =  1000 + 300 + 70 + 4 =  1374
    // 132 =            1*10^2 + 3*10^1 + 2*10^0

    public static long array2long  (int[] arr) {
       long pow = 1;
       long sum = 0;
        for (int i = arr.length - 1; i >=0 ; i--) {
            sum=sum+arr[i]*pow;
            pow=pow*10;
          }
        return sum;
    }

}

