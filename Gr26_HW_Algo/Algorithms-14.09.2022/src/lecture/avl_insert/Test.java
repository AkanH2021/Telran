package lecture.avl_insert;

public class Test {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        int[] keys = {10, 20, 30, 40, 50, 25};
//        int[] keys = {10, 20, 30, 40, 50, 25};
        factoryTree(tree, keys);

        Util.print(tree.getRoot());
    }

    private static void factoryTree(AvlTree tree, int[] keys) {
        for (int key : keys) {
            Node node = new Node(key);
            tree.insert(node, key);
        }
    }
}