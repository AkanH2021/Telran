package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2.      Дан в котором записаны результаты подбрасывания монетки (true\false соответственно орел\решка). -дан List?
        // Необходимо вычислить самую длинную последовательность «орлов».
        //{true,true,false,true,false,true,true,true,false}->3
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(false);
        System.out.println(longestFalseValues(list));
        System.out.println(longestTrueValues(list));
    }

    public static int longestFalseValues(List<Boolean> list) {
        int counter = 0;
        if (!list.isEmpty() && list != null) {
            for (Boolean bool : list) {
                if (!bool)
                    counter++;
            }
        } else {
            return -1;
        }
        return counter;
    }

    public static int longestTrueValues(List<Boolean> list) {
        int counter = 0;
        if (!list.isEmpty() && list != null) {
            for (Boolean bool : list) {
                if (bool)
                    counter++;
            }
        } else {
            return -1;
        }
        return counter;
    }
}

