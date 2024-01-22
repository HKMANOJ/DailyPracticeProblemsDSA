class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    
        // code here
     {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root, sum, 0, list, new ArrayList<Integer>());
        return list;
    }
    
    private static void helper(Node root, int target, int sum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr){


        if(root == null) return;
        curr.add(root.data);
        sum += root.data;
        if(sum == target) list.add(new ArrayList<>(curr));
        helper(root.left, target, sum, list, curr);
        helper(root.right, target, sum, list, curr);
        curr.remove(curr.size()-1);
        
    }
    
}
