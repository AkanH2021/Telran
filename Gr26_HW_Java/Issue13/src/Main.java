import java.util.*;

public class Main {
    public static void main(String[] args) {
/* RU: Создать класс Film и полями класса: название, жанр, рейтинг, год ; Создать список фильмов.
Программа должна спрашивать какая сортировка нужна пользователю (по названию, по рейтингу, по жанру или году)
 и выводить отсортированный список на экран.
 EN: Create class Film and class fields: title, genre, rating, year ; Create a movie list.
        The program should ask what kind of sorting the user needs (by title, by rating, by genre or year)
        and display the sorted list on the screen. */
        Film film1 = new Film("Abcabc", "drama", 6.9, 1994);
        Film film2 = new Film("bbbbb", "crime", 9.8, 1972);
        Film film3 = new Film("iiiii", "action", 4.7, 2008);
        Film film4 = new Film("kkkkk", "action", 9.6, 2003);
        Film film5 = new Film("dddd", "drama", 8.5, 1993);
        Film film6 = new Film("xxxx", "crime", 9.4, 1974);
        Film film7 = new Film("yyyyy", "crime", 6.3, 1957);
        Film film8 = new Film("fffff", "crime", 3.2, 1994);
        Film film9 = new Film("lllll", "action", 9.9, 2010);
        Film film10 = new Film("bbbb part2", "adventure", 7.8, 2002);
        Film film11 = new Film("wwww", "drama", 2.8, 1999);
        Film film12 = new Film("ttttt", "adventure", 8.1, 2001);

        List<Film> movies = new ArrayList<>();
        movies.add(film1);
        movies.add(film2);
        movies.add(film3);
        movies.add(film4);
        movies.add(film5);
        movies.add(film6);
        movies.add(film7);
        movies.add(film8);
        movies.add(film9);
        movies.add(film10);
        movies.add(film11);
        movies.add(film12);

        SortChooser chooser = new SortChooser();
        chooser.getInput(movies);
    }
}


