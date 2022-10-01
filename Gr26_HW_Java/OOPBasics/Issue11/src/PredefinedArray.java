import java.util.Arrays;

public class PredefinedArray implements GetArray  {
   public int[] arrayDefined = new int[] {4, 16, 6, 7};

    public void getArray() {
        System.out.println(Arrays.toString(arrayDefined));
   }
}
