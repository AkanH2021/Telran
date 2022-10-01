import java.util.Arrays;

public class Task21 {
    /* Дано два массива int. Написать метод, который считает, сколько значений из первого
массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3 */
    public static void main(String[] args) {
        int[] intArr1 = new int[]{10, 14, 1, 4, 3};
        int[] intArr2 = new int[]{0, 1, 6, 10, 1, 4, 13};
        System.out.println(intCompare(intArr1, intArr2));
        System.out.println(countSameNumber(intArr1, intArr2));
    }

    public static int intCompare(int[] intArr1, int[] intArr2) {
        int count = 0;
        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //********from teacher
    /*
    {1,1,3,5,8}
    {1,2,2,3,5,19,21}
    */
    public static int countSameNumber(int[] array1, int[] array2){
      int count = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length && !flag; j++) {
                flag=array1[i] ==array2[j];
            }
            if (flag)count++;
        }
        return count;
    }

}






