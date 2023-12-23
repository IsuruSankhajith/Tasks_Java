
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
//////////////////////////////
class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1; // Initialize factor to 1

        // Iterate through each digit place (ones, tens, hundreds, etc.)
        while (n / factor > 0) {
            long currentDigit = (n / factor) % 10; // Extract the current digit
            long before = n / (factor * 10); // Part of the number before the current digit
            long after = n % factor; // Part of the number after the current digit

            if (currentDigit == 0) {
                // If the current digit is 0, count the occurrences based on the number before the current digit
                count += before * factor;
            } else if (currentDigit == 1) {
                // If the current digit is 1, count the occurrences based on both before and after the current digit
                count += before * factor + after + 1;
            } else {
                // If the current digit is greater than 1, count the occurrences based on the number before the current digit plus one
                count += (before + 1) * factor;
            }

            factor *= 10; // Move to the next digit place
        }

        return count;
    }
}
////////////////////////////

class DigitCounter {
    public int countDigitOne(int n) {
        int count = 0;
        long factor = 1; // Initialize factor to 1

        // Iterate through each digit place (ones, tens, hundreds, etc.)
        while (n / factor > 0) {
            long currentDigit = (n / factor) % 10; // Extract the current digit
            long before = n / (factor * 10); // Part of the number before the current digit
            long after = n % factor; // Part of the number after the current digit

            if (currentDigit == 0) {
                // If the current digit is 0, count the occurrences based on the number before the current digit
                count += before * factor;
            } else if (currentDigit == 1) {
                // If the current digit is 1, count the occurrences based on both before and after the current digit
                count += before * factor + after + 1;
            } else {
                // If the current digit is greater than 1, count the occurrences based on the number before the current digit plus one
                count += (before + 1) * factor;
            }

            factor *= 10; // Move to the next digit place
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        DigitCounter digitCounter = new DigitCounter();
        
        // Example usage
        int result1 = digitCounter.countDigitOne(13);
        System.out.println("Output 1: " + result1); // Output: 6

        int result2 = digitCounter.countDigitOne(0);
        System.out.println("Output 2: " + result2); // Output: 0
    }
}
