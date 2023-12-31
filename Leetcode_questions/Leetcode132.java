
/*
132. Palindrome Partitioning II
Hard
5.2K
136
Companies
Given a string s, partition s such that every 
substring
 of the partition is a 
palindrome
.

Return the minimum cuts needed for a palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
Example 2:

Input: s = "a"
Output: 0
Example 3:

Input: s = "ab"
Output: 1
 

Constraints:

1 <= s.length <= 2000
s consists of lowercase English letters only.
 */
class Solution {
    public int minCut(String s) {
        int n = s.length();
        
        // Initialize a boolean table to check if a substring is a palindrome
        boolean[][] isPalindrome = new boolean[n][n];
        
        // Initialize an array to store the minimum cuts for each substring
        int[] minCuts = new int[n];
        
        // Calculate palindrome information
        for (int end = 0; end < n; end++) {
            minCuts[end] = end; // Maximum cuts needed for a substring of length end
            
            for (int start = 0; start <= end; start++) {
                // Check if the characters at start and end positions match
                // and if the inner substring is also a palindrome
                if (s.charAt(start) == s.charAt(end) && (end - start <= 1 || isPalindrome[start + 1][end - 1])) {
                    isPalindrome[start][end] = true;
                    
                    // Update minimum cuts
                    // If start is 0, it means the whole substring is a palindrome,
                    // so no cut is needed; otherwise, update based on the previous cut
                    minCuts[end] = (start == 0) ? 0 : Math.min(minCuts[end], minCuts[start - 1] + 1);
                }
            }
        }
        
        return minCuts[n - 1];
    }
}


class PalindromePartitioning {

    public int minCut(String s) {
        int n = s.length();

        // Initialize a boolean table to check if a substring is a palindrome
        boolean[][] isPalindrome = new boolean[n][n];

        // Initialize an array to store the minimum cuts for each substring
        int[] minCuts = new int[n];

        // Calculate palindrome information
        for (int end = 0; end < n; end++) {
            minCuts[end] = end; // Maximum cuts needed for a substring of length end

            for (int start = 0; start <= end; start++) {
                // Check if the characters at start and end positions match
                // and if the inner substring is also a palindrome
                if (s.charAt(start) == s.charAt(end) && (end - start <= 1 || isPalindrome[start + 1][end - 1])) {
                    isPalindrome[start][end] = true;

                    // Update minimum cuts
                    // If start is 0, it means the whole substring is a palindrome,
                    // so no cut is needed; otherwise, update based on the previous cut
                    minCuts[end] = (start == 0) ? 0 : Math.min(minCuts[end], minCuts[start - 1] + 1);
                }
            }
        }

        return minCuts[n - 1];
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromePartitioning solution = new PalindromePartitioning();

        // Example usage:
        System.out.println(solution.minCut("aab")); // Output: 1
        System.out.println(solution.min
