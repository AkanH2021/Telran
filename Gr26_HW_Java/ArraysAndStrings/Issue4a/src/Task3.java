public class Task3 {
    /*Implement the method that takes int[][] array and line number and check checks that the average
    of the elements in a row is greater than 0 */
    public static void main(String[] args) {
        int[][] testArr = new int[][]{{1, 5, -17}, {2, 7, 4}};  //1  st subarray  sum = 13; 2ns sum = 5
        System.out.println(printSumElemRowsArray(testArr));

        //   System.out.println(Arrays.deepToString   (testArr));
    }

    private static boolean printSumElemRowsArray(int[][] array) {
        int sum = 0;
        double average = 0.0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];;
                average = sum / array[j].length;
            }
            if (average > 0) {
                flag = true;
            }
            if (average <= 0) {
                flag = false;
            }
            System.out.println(" | = " + sum + " | = " + average);
            sum = 0;
        }
        return flag;
    }
}






    /*
    public static boolean intChecker(int[][] array) {
        double average = 0.0;
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                sum = sum + array[i][j];
                average = sum / array[i].length;
                if (average > 0) {
                    flag = true;
                }
                if (average <= 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}

/* сумма всех елементов 2Д массива:
long sum = 0;
for(int i=0;i<n;i++) {
  for(int j=0;j<m;j++) {
       sum+=a[i][j];
    }
}
 */