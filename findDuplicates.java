class Solution {
    public List<Integer> findDuplicates(int[] nums) {
              int arr[] = new int[nums.length+1];
        List<Integer> ans = new ArrayList();
        for(int i : nums)
        {
            arr[i]+=1;
            if(arr[i]>1) ans.add(i);
        }

        return ans;
    }
}
