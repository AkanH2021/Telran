public class HWTasks {

    public static void main(String[] args) {
int[][] arr = new int[][]{{10,9,8}, {-1,-3,1,1}, {0,1,2}};

TwoDimensionalArrayHandler handler = new TwoDimensionalArrayHandler(arr);
        System.out.println(handler.checkRowAvrgPositive(0));
        System.out.println(handler.checkRowAvrgPositive(1));
        System.out.println(handler.checkRowAvrgPositive(2));

        System.out.println(handler.sum(0));
    }

}
