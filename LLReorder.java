/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        
      public ListNode reverse(ListNode head){
            ListNode prev=null;
            ListNode current=head;
            ListNode next=current.next;
            
            while(current!=null){
                current.next=prev;
            prev=current;
            current=next;
            if (next!=null){
                next=next.next;
            }
            }
            return prev;
        }
    public ListNode mid(ListNode head){
            ListNode fast=head;
            ListNode slow=head;
            
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                
            }
            return slow;
        }
    public void reorderList(ListNode head) {
        ListNode hf=head;
        ListNode ans=mid( head);
        ListNode hs=reverse(ans);
        

    
        while(hf!=null&&hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            
            temp=hs.next;
            hs.next=hf;
                hs=temp;
            
            
        }
        if(hf!=null){
                hf.next=null;
            }
        
    }
    
    }
