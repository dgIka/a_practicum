package Day_10;

public class Node {
    private Node rightChild;
    private Node leftChild;
    private int value;
    public boolean compareTo(int a, Node root) {
        if (a == root.getValue() || a > root.getValue()) {
            return true;
        } else return false;
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
