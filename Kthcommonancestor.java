package Tree;

import java.util.ArrayList;
import java.util.List;

public class SecondAcen {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        // Create the binary search tree
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(50);
        root.right.left = new Node(40);
        root.right.right = new Node(60);

        int k = 2;
        int x = 40;
        int y = 60;

        int result = kthCommonAncestor(root, k, x, y);
        System.out.println("The kth common ancestor of " + x + " and " + y + " is: " + result);
    }

    public static int kthCommonAncestor(Node root, int k, int x, int y) {
        if (x == y) return -1;
        List<Integer> list = new ArrayList<>();
        while (root != null) {
            list.add(root.data);
            if (x < root.data && y < root.data) root = root.left;
            else if (x > root.data && y > root.data) root = root.right;
            else break;
        }
        if (k > list.size()) return -1;
        return list.get(list.size() - k);
    }
}
