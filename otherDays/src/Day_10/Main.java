package Day_10;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(20);
        node1.add(23, node1);
        System.out.println(node1.getRightChild().getValue());
    }
}
