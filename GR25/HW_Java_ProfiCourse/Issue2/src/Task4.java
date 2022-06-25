public class Task4 {

    public static void main(String[] args) {
        //      getIndexMinSum(int[][]);
        //     int arra[] =
    }
    //Implement the method that finds the row’s index in the array int[n][k] of random integers with minimum sum of elements

    //from teacher:
    public static int getIndexMinSum(int[][] NewRandomToDimArray) {
        int minSum = Integer.MAX_VALUE;
        int rows = -1;
        for (int i = 0; i < NewRandomToDimArray.length; i++) {
            int newSum = sumDimArray(NewRandomToDimArray, i);
            if (newSum<minSum){
                minSum = newSum;
                rows = i;
            }
        }
        return rows;
    }
    public static int sumDimArray(int[][] newRandomToDimArray, int rows) {
        int sum = 0;
        for (int i = 0; i < newRandomToDimArray[rows].length; i++) {
            sum+= newRandomToDimArray[rows][i];
        }
        return sum;
    }
}