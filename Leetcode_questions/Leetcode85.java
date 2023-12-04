
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
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        // dp[i][j] represents the number of distinct subsequences of s[0...i-1] that equals t[0...j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Empty string t is a subsequence of any string s, so initialize the first column to 1
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        // Fill in the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the current characters in s and t are equal, we have two options:
                // 1. Include the current character in both s and t, so dp[i][j] = dp[i-1][j-1]
                // 2. Exclude the current character in s, so dp[i][j] = dp[i-1][j]
                dp[i][j] = dp[i - 1][j] + (s.charAt(i - 1) == t.charAt(j - 1) ? dp[i - 1][j - 1] : 0);
            }
        }

        return dp[m][n];
    }
}
