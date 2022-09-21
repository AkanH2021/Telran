package lecture.avl_insert;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AvlTree {
    private Node root;

    public Node insert(Node node, int key) {

        if (root == null) {
            root = node;
            return root;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (key == current.getKey()) {
                return parent;
            } else if (key < current.getKey()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(node);
                    Util.setHeightNode(parent);
                    Util.updateHeight(root);
                    root = Util.isBalance(root) ? root : Util.balanceTree(root);
                    return root;
                }
            } else {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(node);
                    Util.setHeightNode(parent);
                    Util.updateHeight(root);
                    root = Util.isBalance(root) ? root : Util.balanceTree(root);
                    return root;
                }
            }
        }
    }
}