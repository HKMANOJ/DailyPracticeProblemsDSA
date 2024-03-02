package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MultipicationArra {
    public static int[] sortedSquares(int[] nums) {
        int[] solution = new int[nums.length];
        Map<Integer, Integer> numCounts = new TreeMap<>();
        for(int i = 0; i < nums.length; i++) {
            int squared = nums[i]*nums[i];
//            int count = numCounts.getOrDefault(squared, 0);
//            numCounts.put(squared, count+1);
            numCounts.put(squared,numCounts.getOrDefault(squared,0)+1);
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            int count = entry.getValue();
            while(count>0) {
                solution[index] = entry.getKey();
                count--;
                index++;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int []nums ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
}
