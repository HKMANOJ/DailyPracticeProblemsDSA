package leetcode;

import java.util.Arrays;

public class MiniDltArrSort {

    public static int minDeletions(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1); // Initialize the LIS array with all 1's

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(lis));
        return n - Arrays.stream(lis).max().getAsInt(); // Return the number of elements to delete
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 7, 4};
        System.out.println(minDeletions(arr)); // Output: 2
    }
}
