import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String[] firstName = {"Olga", "Andrey", "Sergey", "Oleg", "Elena"};
        String[] secondName = {"Olga Sergeevna", "Nikolaev Andrey", "Elena Maers", "Nina Umova", "Tarasova Elena", "Lavrov Oleg"};
        System.out.println(Arrays.toString(nameCorrect(firstName, secondName)));
    }

    public static String[] nameCorrect(String[] firstName, String[] secondName) {
        for (int i = 0; i < secondName.length; i++) {
            if (checkNames(firstName, secondName[i])) {
                for (int j = 0; j < firstName.length; j++) {

                    String[] name = secondName[i].split(" ");
                    if (name[1].equals(firstName[j]))
                        secondName[i] = name[1] + " " + name[0];
                }
            }else {
                System.out.println("Not found: " + secondName[i]);
            }
        }        return secondName;
    }

    public static boolean checkNames(String[] firstName, String str) {
        for (int i = 0; i < firstName.length; i++) {
            if (str.contains(firstName[i])) {
                return true;
            }
        }
        return false;
    }
}
