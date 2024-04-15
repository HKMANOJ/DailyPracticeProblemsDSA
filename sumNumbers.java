class Solution {
        int res;
    void solve(TreeNode root, int path) {
        if(root == null)
            return;

        path = (path * 10) + root.val;
        if(root.left == null && root.right == null) {
            res += path;
            return;
        }

        solve(root.left, path);
        solve(root.right, path);
    }
    public int sumNumbers(TreeNode root) {
                res = 0;
        solve(root, 0);
        return res;
    }
}
