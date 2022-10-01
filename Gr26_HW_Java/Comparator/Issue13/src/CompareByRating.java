import java.util.Comparator;

public class CompareByRating implements Comparator<Film> {

    public int compare(Film o1, Film o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }

}
