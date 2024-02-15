package leetcode;

import java.util.Arrays;

public class Polygen {
    public static long largestPerimeter(int[] nums) {
        int sum=0;
        Arrays.sort(nums);

        long previousElementsSum = 0;
        long ans = -1;
        for (int num : nums) {
            if (num < previousElementsSum) {
                ans = num + previousElementsSum;
            }
            previousElementsSum += num;
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }
}
