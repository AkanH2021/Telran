package lecture.avl_insert;

import java.util.Stack;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class Util {
    // A utility function to get the height of the tree
    public static int getHeightNode(Node node) {
        if (node == null)
            return 0;

        return node.getHeight();
    }

    // method to left rotate
    public static Node leftRotation(Node c) {
        Node b = c.getLeft();
        Node temp = b.getRight();

        // perform swap rotation
        b.setRight(c);
        c.setLeft(temp);

        // update height node
        setHeightNode(c);
        setHeightNode(b);

        // return new root for subtree
        return b;
    }

    // method to right rotate
    public static Node rightRotate(Node a) {
        Node b = a.getRight();
        Node temp = b.getLeft();

        b.setLeft(a);
        a.setRight(temp);

        setHeightNode(a);
        setHeightNode(b);

        return b;
    }

    public static boolean isBalance(Node node) {
        if (node == null) {
            return true;
        }
        int leftHeight = getHeightNode(node.getLeft());
        int rightHeight = getHeightNode(node.getRight());

        if (abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalance(node.getLeft()) && isBalance(node.getRight());
    }

    public static Node balanceTree(Node node) {

        int balance = getBalanceFactor(node);

        // LeftLeft
        if(balance > 1 && node.getKey() > node.getLeft().getKey()) {
            return leftRotation(node);
        }

        // RightRight
        if(balance < -1 && node.getKey() < node.getRight().getKey()) {
            return rightRotate(node);
        }

        // LeftRight
        if(balance > 1 && node.getKey() > node.getLeft().getKey()) {
            node.setLeft(leftRotation(node.getLeft()));
            return rightRotate(node);
        }

        //RightLeft
        if(balance < -1 && node.getKey() < node.getRight().getKey()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotation(node);
        }

        return node;
    }

    // get balance factor of node
    private static int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeightNode(node.getLeft()) - getHeightNode(node.getRight());
    }

    public static void setHeightNode(Node node) {
        node.setHeight(max(getHeightNode(node.getLeft()), getHeightNode(node.getRight())) + 1);
    }

    public static int updateHeight(Node node) {
        if (node == null) {
            return 0;
        }
        node.setHeight(updateHeight(node.getLeft())); // first call recursion on the left subtree
        node.setHeight(updateHeight(node.getRight())); // next call recursion on the right subtree
        return node.getHeight() + 1;
    }


    public static void print(Node root) { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (!isRowEmpty) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }


}