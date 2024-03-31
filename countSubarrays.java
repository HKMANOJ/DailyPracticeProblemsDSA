class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        //variable to count the subarrays
        long cnt = 0;

        // variables to track the minimum and maximum indices of the current subarray
        int min = -1;
        int max = -1;
        
        // left pointer -> To track the index of the first element which is outside the range [minK,maxK]
        int left = -1;
        
        for (int right = 0; right < nums.length; right++) {
            
            int curr = nums[right];
            
            // Current element is outside the range
            if (curr < minK || curr > maxK) {
                left = right;
                min = right;
                max = right;
            }
            
            if (curr == minK) {
                min = right;
            }
        
            if (curr == maxK) {
                max = right;
            }
            
            // Add the count of subarrays ending at the current index to the total count
            cnt += Math.min(min, max) - left;
        }
        
        // Return the total count of subarrays
        return cnt;
    }
}
