public class MaxElement {
    /*
    Create a class, which will have a method to find max element of int array. The class must have a constructor accepting int array.
     */
    private int[] array;

    public MaxElement(int[] array) {
        this.array = array;
    }

    public int findMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}