public class Film {

    private String name;
    private String genre;
    private double rating;
    private int year;

    public Film(String name, String genre, double rating, int year) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getName() { return name;  }
    public String getGenre() {  return genre;  }
    public double getRating() { return rating; }
    public int getYear() { return year;   }

    @Override
    public String toString() {
        return "Name: " + name + "; " + " genre: " + genre +  "; rating=" + rating + "; year=" + year + System.lineSeparator();
    }

}
