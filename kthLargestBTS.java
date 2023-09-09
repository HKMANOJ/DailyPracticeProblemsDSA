//example
//tree right side always large number we are triversing rigth the left
      3
        8-------------- 1st largest
          10-------------->2nd largest
        9-------------- 3rd largest
        ans will be 3


class Solution
{
    int ans=0;
    int count=0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        revInOrder(root,K);
        return ans;
        
    }
    
    public void revInOrder(Node root,int k){
        if(root==null)return;
        revInOrder(root.right,k);
        count++;
        if(count==k){
            ans=root.data;
        }
          revInOrder(root.left,k);
    }
}
