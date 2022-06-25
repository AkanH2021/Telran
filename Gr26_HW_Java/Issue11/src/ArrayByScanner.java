import java.util.Arrays;
import java.util.Scanner;

public class ArrayByScanner implements GetArray {

    @Override
    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

}
