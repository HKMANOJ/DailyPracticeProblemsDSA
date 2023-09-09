//nums = [1,2,3], target = 4
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1]; //[0,0,0,0.0]
        dp[0] = 1;
        for (int i = 1; i <= target; i++)
            for (int num : nums)
                if (num <= i) dp[i] += dp[i-num];
        return dp[target];
    }
}
