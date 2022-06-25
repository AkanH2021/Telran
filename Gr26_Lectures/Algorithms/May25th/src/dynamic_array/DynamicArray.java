package dynamic_array;

public class DynamicArray implements Dynamic{
    private int[] array;
    private int count;
    private int size;

    public DynamicArray(){
        array = new int[1];
        count = 0;
        size = 1;
    }

//    public DynamicArray(int capacity){}

    @Override
    public void add(int data) {
        if (count==size) {
            growSize(); //make array size -> double size(size*2)
            }

             //check number of elements
        array[count] = data;
        count++;
    }

    @Override
    public void addAt(int index, int data) {

    }

    @Override
    public void get(int index) {

    }
}
