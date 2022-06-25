import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FromRomanRichert {
    public static void main(String[] args) {
        //Пусть дан List Integer. Необходимо проверить, есть ли в нем такая пара чисел, что в сумме они дают
        // заданное число. Задачу необходимо решить всеми известными вам способами.

        Scanner sc = new Scanner(System.in);

        List<Integer> listOfIntegers1 = new ArrayList<>();
        listOfIntegers1.add(1);
        listOfIntegers1.add(10);
        listOfIntegers1.add(0);
        listOfIntegers1.add(-1);
        listOfIntegers1.add(-5);
        listOfIntegers1.add(null);
        listOfIntegers1.add(3);
        listOfIntegers1.add(3);
        listOfIntegers1.add(6);
        listOfIntegers1.add(9);
        listOfIntegers1.add(4);

        System.out.println("Enter some number. We will search for a pair of numbers in the list, that can give your number back in their sum.");
        System.out.println(canWeGetYourNumber(sc.nextInt(), listOfIntegers1));
    }

    public static String canWeGetYourNumber(int yourNumber, List<Integer> listOfIntegers) {
        listOfIntegers.removeIf(Objects::isNull);
        int i = 0;

        while (i < listOfIntegers.size()) {
            int j = 0;
            while ((j < listOfIntegers.size())) {
                if ((listOfIntegers.get(i) + listOfIntegers.get(j) == yourNumber) && (!Objects.equals(listOfIntegers.get(i), listOfIntegers.get(j)))) {
                    return "Match found!";
                }
                j++;
            }
            i++;
        }
        return "Match wasn't found :(";
    }
}

