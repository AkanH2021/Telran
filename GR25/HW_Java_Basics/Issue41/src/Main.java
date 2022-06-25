import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArr = {10, 3, 3, 5, -9};
        task2(intArr);
        task3(intArr);
        task4(15);
    }

    /* Task2: Implement a method that returns the new array that is the given array in reverse order
    {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10} */
    public static void task2(int[] intArr) {
        int[] task2Array = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            task2Array[i] = intArr[intArr.length - i - 1];
            System.out.print(task2Array[i] + " ");
        }
        System.out.println();
        System.out.println("*******************");
    }

    /* Task3: Implement a method that returns a given array in reverse order. It’s look like previous,
    but you should solve it without new array {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10} */
    public static void task3(int[] intArr) {
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        System.out.println("*******************");
    }

    /* Given arrays String[] names and int[ ] yearsOfBirthday of the same length, that contains names and years of birthday of the persons.
     Every element in yearsOfBirthday is corresponding with element at the same index in names. Implement the program that prints the name
     and the age of all person who older that given int. Than print the name and age of oldest person.
     For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) -> Olga 18 years   Oleg 40 years
     *******  Oleg 40 years is oldest*/
    public static void task4(int n1) {
        String[] nameArr = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] ageArr = {2004, 1982, 2008, 2010};
        for (int i = 0; i <= ageArr.length - 1; i++) {
            if (n1 < ageArr[i]) {
                if ((2022 - ageArr[i]) > n1)
                    System.out.println(ageArr[i] + " " + nameArr[i]);
            }

            // program that prints the name
            //and the age of all person who older that given int.
        }
    }
}
