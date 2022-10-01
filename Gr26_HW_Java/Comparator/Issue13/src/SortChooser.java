import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortChooser {


    public void getInput(List<Film> movies) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the method for movie sorting: 1 (byRating); 2 (byGenre); 3 (byName); 4 (byYear)");

        switch (input.nextInt()) {
            case 1 -> {
                Comparator<Film> byRating = new CompareByRating();
                movies.sort(byRating);
                System.out.println(movies);
            }

            case 2 -> {
                Comparator<Film> byGenre = new CompareByGenre();
                movies.sort(byGenre);
                System.out.println(movies);
            }
            case 3 -> {
                Comparator<Film> byName = new CompareByName();
                movies.sort(byName);
                System.out.println(movies);
            }
            case 4 -> {
                Comparator<Film> byYear = new CompareByYear();
                movies.sort(byYear);
                System.out.println(movies);
            }
            default -> System.out.println("Allowed range is from 1 to 4 only");
        }
    }
}
