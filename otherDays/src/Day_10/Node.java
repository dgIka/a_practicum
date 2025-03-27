package Day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {
    private Node rightChild;
    private Node leftChild;
    private int value;
    public boolean compareTo(int a, Node root) {
        if (a == root.getValue() || a > root.getValue()) {
            return true;
        } else return false;
    }

    private static void getOrderValues(Node node, List<Integer> list) {
        if (node == null) return;
        getOrderValues(node.getLeftChild(), list);
        list.add(node.getValue());
        getOrderValues(node.getRightChild(), list);
    }




    public List<Integer> getAllValues() {
        List<Integer> list = new ArrayList<>();
        getOrderValues(this, list);
        return list;
    }
    public void add(int a, Node root) {
        if (this.compareTo(a,root)) {
            if (root.getRightChild() == null) {
                root.setRightChild(new Node(a));
            } else this.add(a, root.getRightChild());
        } else if (root.getLeftChild() == null) {
            root.setLeftChild(new Node(a));
        } else this.add(a, root.getLeftChild());
    }

    public Node(int value) {
        this.value = value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
}
