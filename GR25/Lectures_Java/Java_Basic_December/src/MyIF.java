public class MyIF {

    public static void main(String[] args) {
      System.out.println("your penalty is: " + (speeding(30, 91))); //if norm = 30 (allowed normal speed)
    }

    public static int speeding(int norm, int measure) {
        int penalty1 = 0;
        int penalty2 = 20;
        int penalty3 = 50;
        int penalty4 = 150;
        int penalty5 = 300;
        if (measure <= norm + 10) {
            return penalty1;
        }
        if (measure <= norm + 20) {
            return penalty2;
        }
        if (measure <= norm + 40) {
            return penalty3;
        }
        if (measure <= norm + 60) {
            return penalty4;
        } else {
            return penalty5;
        }

    }
}
