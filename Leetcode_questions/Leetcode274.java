
/*

273. Integer to English Words
Hard
2.9K
6.1K
Companies
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

0 <= num <= 231 -  */
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = getSmoothedValue(img, i, j, m, n);
            }
        }
        
        return result;
    }
    
    private int getSmoothedValue(int[][] img, int i, int j, int m, int n) {
        int sum = 0;
        int count = 0;
        
        for (int x = Math.max(0, i - 1); x <= Math.min(m - 1, i + 1); x++) {
            for (int y = Math.max(0, j - 1); y <= Math.min(n - 1, j + 1); y++) {
                sum += img[x][y];
                count++;
            }
        }
        
        return sum / count;
    }
}
