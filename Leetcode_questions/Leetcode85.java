
/*
85. Maximal Rectangle
Hard
9.5K
156
Companies
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

 

Example 1:


Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6
Explanation: The maximal rectangle is shown in the above picture.
Example 2:

Input: matrix = [["0"]]
Output: 0
Example 3:

Input: matrix = [["1"]]
Output: 1
 

Constraints:

rows == matrix.length
cols == matrix[i].length
1 <= row, cols <= 200
matrix[i][j] is '0' or '1'.
*/
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Array to store the height of each bar in the histogram
        int[] heights = new int[cols];
        int maxArea = 0;

        // Iterate through each row of the matrix
        for (int i = 0; i < rows; i++) {
            // Update heights based on the current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            // Calculate the maximum area of a rectangle for the current row
            maxArea = Math.max(maxArea, calculateMaxRectangleArea(heights));
        }

        return maxArea;
    }

    // Helper function to calculate the maximum area of a rectangle for a given histogram
    private int calculateMaxRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        // Iterate through each bar in the histogram
        for (int i = 0; i <= heights.length; i++) {
            // Set the currentHeight to 0 if we are at the end of the histogram
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            // Update the stack to maintain a non-decreasing order of histogram heights
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                // Calculate the width of the rectangle using the popped bar's index
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                // Update the maximum area
                maxArea = Math.max(maxArea, h * w);
            }

            // Push the current bar's index onto the stack
            stack.push(i);
        }

        return maxArea;
    }
}
