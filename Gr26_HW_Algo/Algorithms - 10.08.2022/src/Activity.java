public class Activity {
    private String name;
    private int startTime;
    private int endTime;
    private int value;

    public Activity(String name, int startTime, int endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        if (((getEndTime() + getStartTime())/2) < 13){
           value = 1;
       }else if ((getEndTime() + getStartTime())/2 >= 13){
            value = 2;
       }
        return value;
    }


    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", value=" + setValue(getValue()) +
                '}';
    }
}

//        int len = activity.endTime - activity.startTime + 1;
//        int[] intAct = new int[len];
//
//        for (int i = 0; i < len; i++) {
//            intAct[i] = activity.startTime++;
//        }

//if (((activity.endTime + activity.startTime)/2) < 13){
//        value = 1;
//        }else if ((activity.endTime + activity.startTime)/2 >= 13){
//        value = 2;
//        }
//        return value;
//        }