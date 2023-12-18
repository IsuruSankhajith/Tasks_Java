
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
public class ShortestPalindromeFinder {

    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = computeLPS(combined);

        int palindromeLength = lps[lps.length - 1];
        String prefix = rev.substring(0, rev.length() - palindromeLength);

        return prefix + s;
    }

    private int[] computeLPS(String str) {
        int[] lps = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lps[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                lps[i] = j + 1;
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        ShortestPalindromeFinder finder = new ShortestPalindromeFinder();

        // Example 1
        String s1 = "aacecaaa";
        String result1 = finder.shortestPalindrome(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1);

        // Example 2
        String s2 = "abcd";
        String result2 = finder.shortestPalindrome(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2);
    }
}
