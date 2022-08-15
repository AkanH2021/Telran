import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public void selectActivity(List<Activity> list) {
        printList(list);
        System.out.println("-------------");
        list.sort(Comparator.comparingInt(Activity::getValue));
        list.sort(Comparator.comparingInt(Activity::getEndTime));
        printList(list);
        System.out.println("-------------");

        Activity first = list.get(0);

        List<Activity> result = new ArrayList<>();
        result.add(first);

        int endTime = first.getEndTime();
        int firstVal = first.getValue();

        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i).getStartTime() >= endTime) && list.get(i).getValue() >= firstVal) {
                Activity current = list.get(i);

                result.add(current);
                endTime = current.getEndTime();
            }
        }
        printList(result);
    }

    private void printList(List<Activity> list) {
        for (Activity a : list) {
            System.out.println(a);
        }
    }

}
