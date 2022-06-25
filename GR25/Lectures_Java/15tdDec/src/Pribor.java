public class Pribor {

    public static void main(String[] args) {
        int temp1 = getTemperature1();
        int temp2 = getTemperature2();

        System.out.println("Temperature 1 is " + temp1);
        System.out.println("Temperature 2 is " + temp2);
        System.out.println("The temperatures are correct - " + check(temp1, temp2));


    }

    public static boolean check(int temperature1, int temperature2) {
        if ((temperature1 > 100 && temperature2 < 100) || (temperature1<100 && temperature2 >100)){
            return true;
        }
        else {
            return false;
        }
    }



    public static int getTemperature1 () {
            return 180;
        }
        public static int getTemperature2 () {
            return 180;
        }

}








