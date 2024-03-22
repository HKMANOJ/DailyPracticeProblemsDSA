/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       
            ListNode midle=mid(head);
        ListNode secondof=reverse(midle);
       ListNode aginrevesdr=secondof;
 
        while (head!=null&&secondof!=null){
            if (head.val!= secondof.val){
                break;
            }
           head=head.next;
            secondof=secondof.next;
        }
        reverse(aginrevesdr);
       return head==null||secondof==null;
    }
     public ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
 
        while (fast!=null&&fast.next!=null){
 
            slow=slow.next;
            fast=fast.next.next;
 
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode curent=head;
        ListNode next=curent.next;
 
        while (curent!=null){
            curent.next=prev;
            prev=curent;
            curent=next;
            if (next!=null){
                next=next.next;
            }
        }
 
        return prev;
    }
}