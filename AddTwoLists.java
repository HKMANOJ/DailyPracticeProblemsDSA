package GFG;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class GfG {
    static Node head1, head2;
    public static void main(String[] args) {
        GfG list = new GfG();

        // creating first list
        head1 = new Node(4);
        head1.next = new Node(5);
        System.out.print("First list is ");
        list.printList(head1);

        // creating second list
        head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        System.out.print("Second list is ");
        list.printList(head2);

        System.out.print("Resultant list is ");
        // add the two lists and see the result
        Node result = addTwoLists(head1, head2);
        list.printList(result);
    }
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }


    static Node reverse(Node head){

        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;

    }

    static Node add(Node first , Node second){

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while(first != null || second != null || carry > 0){

            int sum = carry;

            if(first != null){
                sum += first.data;
                first = first.next;
            }

            if(second != null){
                sum += second.data;
                second = second.next;
            }

            carry = sum/10;
            current.next = new Node(sum%10);
            current = current.next;
        }
        return dummy.next;

    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list

        Node list1 = reverse(first);
        Node  list2 = reverse(second);

        Node ans = add(list1 , list2);

        ans = reverse(ans);

        Node cur = ans;

        //Avoid leading zeros
        while(cur != null && cur.data == 0){
            cur = cur.next;
        }

        return cur == null ? new Node(0) : cur;
    }



}



