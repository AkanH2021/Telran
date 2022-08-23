import java.util.Scanner;

public class LiftChooser {

    public static int setLowestFloor() {
        int lowestFloor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lowest floor of the building");
        lowestFloor = sc.nextInt();
        return lowestFloor;
    }

    public static int setHighestFloor() {
        int highestFloor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter highest floor of the building");
        highestFloor = sc.nextInt();
        return highestFloor;
    }

    public int setCurrentCall() {
        int currentCall;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current floor");
        currentCall = sc.nextInt();
        return currentCall;
    }

    public void liftCaller() {
        int low = setLowestFloor();
        int high = setHighestFloor();
        int call = setCurrentCall();

        int border1 = getRandomNumber1(low, high);
        int border2 = getRandomNumber1(low, high);

        System.out.println("You are currently on the :" + call + " floor");

        int length1 = Math.abs(call - border1);
        int length2 = Math.abs(call - border2);

        System.out.println("Lift A is on: " + border1 + " floor, need to travel " + length1 + " floors");
        System.out.println("Lift B is on: " + border2 + " floor, need to travel " + length2 + " floors");
        System.out.println("-----");

        if (length1 < length2) {
            System.out.println("Lift A is coming");
        } else if (length1 == length2) {
            System.out.println("Both Lifts are coming");
        } else {
            System.out.println("Lift B is coming");
        }
    }

    public int getRandomNumber1(int min, int max) {
        return (int) ((Math.random() * (max - min) + 1) + min);
    }

}

