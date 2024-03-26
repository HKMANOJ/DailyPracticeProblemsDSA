class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;

        while(i<nums.length){
            int corect=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[corect]){
                swap(nums,i,corect);
            }else{
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
         return nums.length+1;
    }
   

      private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
