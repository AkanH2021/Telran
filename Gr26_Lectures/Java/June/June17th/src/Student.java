import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        double res = 0.0;
        for (Integer i: scores ) {
            if (i != null){
            res += i; }
        }
        return (double) res/scores.size();
    }

    @Override
    public String toString() {
        return name + "   "  + scores;
    }
}
