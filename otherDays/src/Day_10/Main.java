package Day_10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(20);
        node1.add(23, node1);
        node1.add(14, node1);
        node1.add(11, node1);
        node1.add(5, node1);
        node1.add(8, node1);
        node1.add(16, node1);
        node1.add(15, node1);
        node1.add(18, node1);
        node1.add(22, node1);
        node1.add(27, node1);
        node1.add(24, node1);
        node1.add(150, node1);
        System.out.println(node1.getAllValues());
    }
}
