
/*
Convert a non-negative integer num to its English words representation.

 

Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 

Constraints:

0 <= num <= 231 - 1
 */
public class Solution {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberToWords(123)); // Output: "One Hundred Twenty Three"
        System.out.println(solution.numberToWords(12345)); // Output: "Twelve Thousand Three Hundred Forty Five"
        System.out.println(solution.numberToWords(1234567)); // Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
    }
}
//////////////////////////////////////////////////////////////////

public class NumberToWordsConverter {
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    public static void main(String[] args) {
        NumberToWordsConverter converter = new NumberToWordsConverter();
        System.out.println(converter.convertToWords(123)); // Output: "One Hundred Twenty Three"
        System.out.println(converter.convertToWords(12345)); // Output: "Twelve Thousand Three Hundred Forty Five"
        System.out.println(converter.convertToWords(1234567)); // Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
    }
}
//////////////////////////////////

public class NumberToWordsConverter {
    // Arrays to store words for numbers less than 20, multiples of 10, and thousands.
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    // Main method to convert a number to its English words representation.
    public String convertToWords(int num) {
        // Special case for zero.
        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        // Iterate through the number in groups of three digits.
        while (num > 0) {
            // If the current group is not zero, append its words along with the appropriate unit.
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        // Trim any leading or trailing spaces and return the result.
        return words.trim();
    }

    // Helper method to convert a three-digit chunk to its English words representation.
    private String helper(int num) {
        // Base case: if the chunk is zero, return an empty string.
        if (num == 0) {
            return "";
        }
        // Case for numbers less than 20.
        else if (num < 20) {
            return LESS_THAN_20[num] + " ";
        }
        // Case for numbers between 20 and 99.
        else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        }
        // Case for numbers between 100 and 999.
        else {
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }

    // Main method to test the NumberToWordsConverter class.
    public static void main(String[] args) {
        NumberToWordsConverter converter = new NumberToWordsConverter();
        System.out.println(converter.convertToWords(123)); // Output: "One Hundred Twenty Three"
        System.out.println(converter.convertToWords(12345)); // Output: "Twelve Thousand Three Hundred Forty Five"
        System.out.println(converter.convertToWords(1234567)); // Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
    }
}
