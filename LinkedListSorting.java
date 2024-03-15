class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
    if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node left = sort(head);
        Node right = sort(mid);

        return merge(left, right);
    }

    Node merge(Node list1, Node list2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

  Node getMid(Node head) {
    if (head == null) {
        return null;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    Node mid = slow.next; // This is the middle node
    slow.next = null; // Breaking the link to split the list into two halves
    return mid;
}


}
