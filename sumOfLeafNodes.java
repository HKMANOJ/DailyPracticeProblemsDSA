// n = 6
// arr = {67, 34, 82, 12, 45, 78}
// Output:
// 135
// Explanation:
// In first test case, the BST for the given input will be-
//                 67
//              /     \
//            34       82
//           /   \    /
//          12   45  78

class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
        if(root==null)return 0;
        if(root.left == null && root.right == null){
            return root.data;
        }
      
         int sumLeft = sumOfLeafNodes(root.left);
        int sumRight = sumOfLeafNodes(root.right);

        // Return sum of leaf nodes in left and right subtrees
        return sumLeft + sumRight;
        
    }
}
