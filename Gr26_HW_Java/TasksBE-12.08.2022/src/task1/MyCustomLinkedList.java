package task1;

public class MyCustomLinkedList<T> {
    Node head;

    public void addToTail( T data) {
        Node newNode = new Node<>(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(newNode);
    }

    public void addToHead(T data) {
        Node newNode = new Node<>(data, null);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void removeByIndex(int index) {
        Node current = head;
        int jump;
        if (index < 1) {
            System.out.println("Index is out of bound");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public <T> Object get(int index) {   //get by index
        int count = -1;
        if (head == null) {
            System.out.println("Index is out of bound");
        }
        if (index < 0 || index > size()) {
            System.out.println("Index is out of bound");
        }
        Node node = head;
        while (node != null) {
            count++;
            if (count == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return -1;
    }

    public int size() {
        Node node;
        int count = 0;
        for (node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }

    public void printAllElements() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData() + " ");
            node = node.getNext();
        }
    }

}
