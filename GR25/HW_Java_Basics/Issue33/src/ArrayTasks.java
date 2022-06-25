import java.util.Arrays;

public class ArrayTasks {

    public static void main(String[] args) {
        task7();
        task8();
        task9();
        System.out.println(task10(new String[]{"Lera", "Inna", "Nick", "Jack"}, "Inna"));
    }

    /* Task7: Implement a method that returns the sum of a given array of int
    {10, 3, 3, 5, -9} -> 12  */
    public static void task7() {
        int[] task1Array = {10, 3, 3, 5, -9};
        int sum = 0;
        for (int i = 0; i < task1Array.length; i++)

            sum += task1Array[i];
        System.out.println(sum);
        System.out.println("--------");
    }

    // Task8: Implement a method that returns the biggest element of a given array of int
    //{10, 3, 3, 5, -9} -> 10
    public static void task8() {
        int[] task1Array = {10, 3, 3, 5, -9};
        int max = task1Array[0];

        for (int i = 0; i < task1Array.length; i++) {
            if (task1Array[i] > max) {
                max = task1Array[i];
            }
        }
        System.out.println(max);
        System.out.println("--------");
    }

    // Task9: Implement a method that returns the index of the biggest element of a given array of int
    //{10, 3, 3, 5, -9} -> 0
    public static void task9() {
        int[] task1Array = {10, 3, 3, 5, -9};
        int max = task1Array[0];
        int index = 0;

        for (int i = 0; i < task1Array.length; i++) {
            if (task1Array[i] > max) {
                index = i;
            }
        }
        System.out.println(index);
        System.out.println("--------");
    }

    /* Task 10: Implement a method that takes an array of names (Strings[]) and return the index of
an element that contains the given name. You have to create the array in the main() method.
({“Lera”,”Inna”,”Nick”,”Jack”} , “Nick”) -> 2
({“Lera”,”Inna”,”Nick”,”Jack”} , “Lera”) -> 0
({“Lera”,”Inna”,”Nick”,”Jack”} , “Kevin”) -> -1  */
    public static int task10(String[] strMass, String strX) {
        int index = 0;
        for (int i = 0; i < strMass.length; i++) {
            if (strX.equals(strMass[i])) {
                index = i;
                return index;
            }
            if (!strX.equals(strMass[i])) {
                index = -1;
            }
        }
        return index;
    }
}
