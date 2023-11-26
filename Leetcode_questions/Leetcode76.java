
/*
76. Minimum Window Substring
Hard
16.5K
677
Companies
Given two strings s and t of lengths m and n respectively, return the minimum window 
substring
 of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
 

Follow up: Could you find an algorithm that runs in O(m + n) time?
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        // Initialize two pointers and a hashmap to track character frequencies
        int left = 0, right = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Initialize variables to track the minimum window substring
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length();

        // Populate the charFreqMap with the frequencies of characters in string t
        for (char c : t.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string s using the right pointer
        while (right < s.length()) {
            char rightChar = s.charAt(right);

            // If the current character is required, decrement the requiredChars count
            if (charFreqMap.containsKey(rightChar)) {
                charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
                if (charFreqMap.get(rightChar) >= 0) {
                    requiredChars--;
                }
            }

            // Move the left pointer to find a smaller window
            while (requiredChars == 0) {
                // Update the minimum window substring if a smaller window is found
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);

                // If the left character is in charFreqMap, increment its count
                if (charFreqMap.containsKey(leftChar)) {
                    charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);

                    // If the count becomes positive, increment requiredChars
                    if (charFreqMap.get(leftChar) > 0) {
                        requiredChars++;
                    }
                }

                // Move the left pointer to find the next valid window
                left++;
            }

            // Move the right pointer to expand the window
            right++;
        }

        // If no valid window is found, return an empty string
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
