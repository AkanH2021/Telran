//Create a class MyDate with the following fields: int day, int month, int year.
//a. Implement the constructor method. It should take three integer arguments.
//b. Implement String toString() method, that returns the String something like “21-15-2022”
public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int dd, int mm, int yyyy) {
        day = dd;
        month = mm;
        year = yyyy;
    }

    public String toString() {
        String date = day + "-" + month + "-" + year;
        return date;
    }
}
