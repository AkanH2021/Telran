import java.util.Arrays;
import java.util.Scanner;

public class RandomArray implements GetArray {

    @Override
    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = sc.nextInt();
        System.out.println("Enter lowest element of the array:");
        int min = sc.nextInt();
        System.out.println("Enter biggest element of the array:");
        int max = sc.nextInt();
        int range = max - min + 1;

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range) + min;
        }
        System.out.println(Arrays.toString(array));
    }
}
