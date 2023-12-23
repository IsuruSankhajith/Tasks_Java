
/*
233. Number of Digit One
Hard
1.4K
1.4K
Companies
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

 

Example 1:

Input: n = 13
Output: 6
Example 2:

Input: n = 0
Output: 0
 

Constraints:

0 <= n <= 109
 */
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1; // Initialize factor to 1

        while (n / factor > 0) {
            long currentDigit = (n / factor) % 10;
            long before = n / (factor * 10);
            long after = n % factor;

            if (currentDigit == 0) {
                count += before * factor;
            } else if (currentDigit == 1) {
                count += before * factor + after + 1;
            } else {
                count += (before + 1) * factor;
            }

            factor *= 10; // Move to the next digit place
        }

        return count;
    }
}
