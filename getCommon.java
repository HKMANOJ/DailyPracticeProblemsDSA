class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
     
        Set<Integer> set=new HashSet<>();
       
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
           
        }
    for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }

        // Return -1 if there are no common elements
        return -1;
    }
}
