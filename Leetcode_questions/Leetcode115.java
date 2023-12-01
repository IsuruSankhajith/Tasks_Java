
/*
115. Distinct Subsequences
Hard
6.3K
279
Companies
Given two strings s and t, return the number of distinct subsequences of s which equals t.

The test cases are generated so that the answer fits on a 32-bit signed integer.

 

Example 1:

Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit
Example 2:

Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag
 

Constraints:

1 <= s.length, t.length <= 1000
s and t consist of English letters.
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
