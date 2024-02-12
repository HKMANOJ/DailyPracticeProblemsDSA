class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
///////////
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int count = 1;
            for(int j=i+1;j<n;j++) {
                if(nums[i] == nums[j]) count++;
            }
            if(count > n/2) return nums[i];
        }
        return -1;
    }
}
//////////////////////
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freqCount = new HashMap();
        for(int num: nums) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: freqCount.entrySet()) {
            if(entry.getValue() > n/2) return entry.getKey();
        }
        return -1;
    }
}
