import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1a");
        list.add("2b");
        list.add("3c");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //-----------------------------
        for (String s : list) {
            System.out.println(s);
        }

        int[] arr = {1,2,3,4};
        long sum = 0;
        for (int i:arr ) {
            sum +=i;
            System.out.println(i);
        }
    }

}

  /* int a = 10;
        int b = 20;
        boolean bool = a<b;
        int temp = (a<b)? a:a+10;
           System.out.println(temp);
           System.out.println(((a>b)? a : a+10)==10 ? "десять":"не десять");
        if ( ((a>b)? a:b) >15) {
            }
        for (int i = (a>b)? a:b; i < ((a>b)? a :b; i++) {
        }
                 */