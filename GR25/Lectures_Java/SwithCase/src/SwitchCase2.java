public class SwitchCase2 {


    public static void main(String[] args) {
        int key = 2;
        switch (key) {
            case 1:
                System.out.println("1.");
                break;
            case 2:
                System.out.println("2.");
                break;
            case 3:
                System.out.println("3.0");

            default:
                System.out.println("-----");
        }
        System.out.println("run.....");
        System.out.println(getStringMeg(2));
    }


        public static String getStringMeg(int key){
           String resMsg = "";
            switch (key) {
                case 1:
                    resMsg = "1. Step 1";
                    break;
                case 2:
                    resMsg =  "2. Step 2";
                    break;
                case 3:
                    resMsg =  "3. Step 3";
                    break;
                default:
                    resMsg =  ("step?");
                    System.out.println("step ....... ?");
            }
            return resMsg;
        }


}
