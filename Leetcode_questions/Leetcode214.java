
/*
214. Shortest Palindrome
Hard
3.5K
231
Companies
You are given a string s. You can convert s to a 
palindrome
 by adding characters in front of it.

Return the shortest palindrome you can find by performing this transformation.

 

Example 1:

Input: s = "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: s = "abcd"
Output: "dcbabcd"
 

Constraints:

0 <= s.length <= 5 * 104
s consists of lowercase English letters only.
 */
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        
        int[] lps = new int[combined.length()];
        // Construct the longest prefix suffix array
        for (int i = 1; i < combined.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                lps[i] = j + 1;
            }
        }
        
        // The length of the palindrome that starts from the beginning
        int palindromeLength = lps[lps.length - 1];
        // Construct the palindrome by adding characters from the reversed string
        String prefix = rev.substring(0, rev.length() - palindromeLength);
        
        return prefix + s;
    }
}
