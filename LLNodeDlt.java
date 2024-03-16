class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
              Node temp = del; 

        

        del.data = temp.next.data;

        del.next = temp.next.next;
    }
}
