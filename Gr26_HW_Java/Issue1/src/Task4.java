import java.util.Arrays;

public class Task4 {
    /*  Implement a method that returns new array of int. Every element of the array is next power of two.
    The length of the array is given n (the max value of n is 30. Why do you think?)
powerOfTwo (5) -> {1,2,4,8,16}  */
    public static void main(String[] args) {
        System.out.println(newArrPow(5));
    }

    public static String newArrPow(int n) {
        int[] array = new int[n];
        array[0] = 1;
        for (int i = 1; i < n; i++) {
            array[i] = (int) Math.pow(2, i);
        }
        return Arrays.toString(array);
    }

}
