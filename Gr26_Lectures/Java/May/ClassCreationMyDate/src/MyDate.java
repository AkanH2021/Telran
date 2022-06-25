public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void print(){
        System.out.println(day + "/" + month + "/" + year);
    }

    @Override
    public String toString() {
    return "MyDate{" +
    "day=" + day +
               ", month=" + month +
                ", year=" + year +
               '}';
    }
}
