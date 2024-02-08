package leetcode;

public class perfectsqr {
    public int numSquares(int n) {
        // Base case: if n is a perfect square, return 1
        if (isPerfectSquare(n))
            return 1;

        // Find all perfect squares less than or equal to n
        int result = n; // Maximum number of perfect squares needed is n
        for (int i = 1; i * i <= n; i++) {
            result = Math.min(result, 1 + numSquares(n - i * i));
        }

        return result;
    }

    // Helper function to check if a number is a perfect square
    private boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
    public static void main(String[] args) {
        perfectsqr ps = new perfectsqr();
        System.out.println(ps.numSquares(12));  // Output: 3
        //System.out.println(ps.numSquares(13));  // Output: 2
    }
}


//DP solution


class Solution {
     // Helper function to check if a number is a perfect square
        public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
   
    
}
