package task1;

public class Node <T> {
    private T data; //Data in the current node
    private Node next; //Reference for the next node

    //Constructor which takes an int value which is stored as the    data in this Node object.
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
