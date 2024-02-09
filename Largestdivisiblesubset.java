class Solution {
  public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        solve(1,0,nums,new ArrayList<>(),res,dp);
        return res;
    }
    void solve(int j,int i,int[] nums,ArrayList<Integer> currAns,ArrayList<Integer> res,int[] dp) {
        if(i >= nums.length) {
            if(currAns.size() > res.size()) {
                res.clear();
                res.addAll(currAns);
            }
            return;
        }    
        if(dp[i] < currAns.size() && (j%nums[i] ==0 || nums[i]%j == 0)) {
            dp[i] = currAns.size();
            currAns.add(nums[i]);
            solve(nums[i],i+1,nums,currAns,res,dp);
            currAns.remove(currAns.size()-1);
        }
        solve(j,i+1,nums,currAns,res,dp);
    }
}