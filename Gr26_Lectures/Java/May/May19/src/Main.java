public class Main {
    public static void main(String[] args) {

        String name  = "Name";
        int day = 10;
        int month = 8;
        int year = 2000;

        MyDate date10 = new MyDate(10, 5, 2022);
        date10.day = 10;
        date10.month = 5;
        date10.year = 2022;

        date10.print();

        MyDate newDate = addDay(date10);
        newDate.print();


        MyDate date1 = new MyDate(12, 5, 1988);
        MyDate date2 = new MyDate(13, 5, 2022);
        MyDate date3 = new MyDate(14, 5, 2022);

        MyDate[] dateArray = new MyDate[]{date1, date2, date3};
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i].print();
        }

        Person p1 = new Person("Nick", date1);
        p1.print();
        System.out.println("-------------------");
        p1.print();


    }


    public static int addOne(int a){
        int b = a+1;
        return a+1;
        }

        public static MyDate createMyDate(int day, int month, int year){
        MyDate result = new MyDate(10, 5, 2022);
        result.day = day;
        result.month = month;
        result.year = year;
        return result;
        }
    public static MyDate addDay(MyDate date){
        MyDate result = new MyDate(10, 5, 2022);
        result.day = date.day+1;
        result.month = date.month;
        result.year = date.year;
        return result;
    }
}

/* Создать класс автомобиль, у которого должны быть следующие поля - модель, год выпуска, цвет.
Создать метод печати, также создать в методе main несколько обьектов класса, положить их в массив и распечатать */
