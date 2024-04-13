package leetcode;

import java.util.Arrays;

public class Matrix {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols + 1]; // Include an extra element for easier calculation
        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            // Calculate max area using histogram method
            int n = heights.length; // Number of bars in the histogram

            for (int i = 0; i < n; i++) {
                for (int j = i, minHeight = Integer.MAX_VALUE; j < n; j++) {
                    minHeight = Math.min(minHeight, heights[j]);
                    int area = minHeight * (j - i + 1);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        String[][] matrixStr = {
                {"1","0","1","0","0"},
                {"1","0","1","1","1"},
                {"1","1","1","1","1"},
                {"1","0","0","1","0"}
        };

        // Convert String[][] to char[][]
        char[][] matrix = new char[matrixStr.length][matrixStr[0].length];
        for (int i = 0; i < matrixStr.length; i++) {
            for (int j = 0; j < matrixStr[i].length; j++) {
                matrix[i][j] = matrixStr[i][j].charAt(0); // Convert String to char
            }
        }

        // Call the maximalRectangle method
        int maxRectangleArea = maximalRectangle(matrix);
        System.out.println("Maximum rectangle area: " + maxRectangleArea);
    }

}
