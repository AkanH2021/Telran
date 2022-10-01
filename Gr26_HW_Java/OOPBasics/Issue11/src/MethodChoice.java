import java.util.Scanner;

public class MethodChoice {
    public void choose(GetArray create) {
        create.getArray();
    }

    public static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the method for array creation: 1 (Enter by scanner); 2 (Predefined array); 3 (Random array);");
        return input.nextInt();
    }

    static GetArray byWhichMethod(int num) {
        return switch (num) {
            case 1 -> new ArrayByScanner();
            case 2 -> new PredefinedArray();
            case 3 -> new RandomArray();
            default -> null;
        };
    }
}
