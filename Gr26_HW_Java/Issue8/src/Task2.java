import java.util.ArrayList;

public class Task2 {
    /*  2. Дан лист с именами. Необходимо получить лист в котором присутствуют имена из исходного листа, но только те, что короче 3 символов. */
    public static void main(String[] args) {

        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Ivan");
        namelist.add("Maria");
        namelist.add("Ira");
        namelist.add("Michail");
        namelist.add("Su");

        System.out.println(task2(namelist));

    }

    public static ArrayList<String> task2(ArrayList<String> namelist) {
        ArrayList<String> shortNames = new ArrayList<>();
        for (String s : namelist) {
            if (s.length() <= 3) {
                shortNames.add(s);
            }
        }
        return shortNames;
    }

}

