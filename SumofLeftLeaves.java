class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
       return solve(root);
    }
       public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
            //check the left leaf
            if(root.left != null && root.left.left == null && root.left.right == null){
                return root.left.val + solve(root.right);
            }
            return solve(root.left) + solve(root.right);
    }
}
