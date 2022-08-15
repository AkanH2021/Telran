import java.util.ArrayList;
import java.util.List;

public class Main {
    //First level: Задача: максимальная выгода, второстепенно заполнение зала
    //зал для конференций работает с 9:00 до 17:00
    //заявки с 9:00 до 13:00 стоят 1 единицу
    //заявки с 13:00 до 17:00 стоят 2 единицы
    //заявки на пересечении в большую сторону 9:00 стоят 1 ед
    //например с 11 до 14 стоит 1 ед
    //заявки на пересечении в большую сторону 17:00 стоят 2 ед
    //например с 12 до 16 стоит 2 ед
    public static void main(String[] args) {
        List<Activity> list = new ArrayList<>();
        list.add(new Activity("a", 12, 14));
        list.add(new Activity("b", 10, 12));
        list.add(new Activity("c", 9, 14));
        list.add(new Activity("d", 13, 16));
        list.add(new Activity("e", 9, 10));
        list.add(new Activity("f", 15, 17));
        ActivitySelection activitySelection = new ActivitySelection();
        activitySelection.selectActivity(list);



    }
}
