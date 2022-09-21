package lecture.avl_insert;


public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;
    private int height;

    public Node(int key) {
        this.key = key;
        this.value = "" + key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", height=" + height +
                '}';
    }
}