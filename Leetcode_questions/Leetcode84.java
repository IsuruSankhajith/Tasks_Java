
/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4
 

Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
*/
class Solution {
    public int largestRectangleArea(int[] heights) {
        // Stack to store indices of bars in increasing order of heights
        Stack<Integer> stack = new Stack<>();
        // Variable to store the maximum area
        int maxArea = 0;

        // Iterate through the array, including an extra iteration to handle remaining bars in the stack
        for (int i = 0; i <= heights.length; i++) {
            // While the stack is not empty and the current bar is shorter than the bar at the top of the stack
            while (!stack.isEmpty() && (i == heights.length || heights[i] < heights[stack.peek()])) {
                // Pop the top bar from the stack
                int height = heights[stack.pop()];
                // Calculate the width of the rectangle using the difference in indices
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                // Update the maximum area
                maxArea = Math.max(maxArea, height * width);
            }
            // Push the current index onto the stack
            stack.push(i);
        }

        // Return the maximum area found
        return maxArea;
    }
}
