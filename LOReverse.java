package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class ReverseLOrder {
    public static ArrayList<Integer> reverseLevelOrder(Node node)
    {
        // code here


        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            int a=0;
            for(int i=0;i<size;i++){
                Node temp = q.poll();
                ans.add(a,temp.data);
                a++;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);

        ArrayList<Integer> traversalResult = reverseLevelOrder(root);
        System.out.println("Level-order traversal of the binary tree:");
        for (Integer nodeData : traversalResult) {
            System.out.print(nodeData + " ");
        }
    }
}
