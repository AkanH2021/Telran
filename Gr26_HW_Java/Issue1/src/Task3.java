public class Task3 {
    /* Implement a method that prints all elements of the given array that bigger than average value of array elements
{2, 6, 5, 3} -> 6 5 */
    public static void main(String[] args) {
        int[] testArr = new int[]{2, 6, 5, 3};
        biggerElements(testArr);
    }

    static void biggerElements(int[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++)
            average += arr[i];
        average = average / arr.length;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > average)
                System.out.print(arr[i] + ",");
    }

}


