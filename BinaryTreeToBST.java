class Solution
{
    int index = 0;
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       if(root == null)
            return null;
            
        
        Queue<Node> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            arr.add(curr.data);
            
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }

       Collections.sort(arr);
       arrayToBST(arr, root);
       return root;
    }
      private void arrayToBST(List<Integer> arr, Node root){
        if(root == null)
            return;
        
        //Left Subtree
        arrayToBST(arr,root.left);
        root.data = arr.get(index++);
        arrayToBST(arr,root.right);
    }
}
