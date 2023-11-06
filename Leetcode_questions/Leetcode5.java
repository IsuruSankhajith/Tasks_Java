////////////////////////////////////////////////////////////////////
//1
////////////////////////////////////////////////////////////////
/*
5. Longest Palindromic Substring
Medium

Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
*/
----------------
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }

        boolean[][] isPalindrome = new boolean[n][n];
        int maxLen = 1;
        int start = 0;

        // All individual characters are palindromes.
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        // Check for palindromes of length 2.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                maxLen = 2;
                start = i;
            }
        }

        // Check for palindromes of length greater than 2.
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1]) {
                    isPalindrome[i][j] = true;
                    if (len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}
