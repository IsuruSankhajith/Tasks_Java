////////////////////////////////////////////////////////////////////
//1
////////////////////////////////////////////////////////////////
/*
3. Longest Substring Without Repeating Characters
Medium
37.7K
1.7K
Companies
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces. 
*/
----------------
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int[] charIndex = new int[256]; // Assuming ASCII characters

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the substring, move the left pointer to the right of its last occurrence
            if (charIndex[currentChar] > 0) {
                left = Math.max(left, charIndex[currentChar]);
            }

            charIndex[currentChar] = right + 1; // Update the last index of the character

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
