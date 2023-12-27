
/*
Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

 

Example 1:


Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]
Example 2:


Input: board = [["a","b"],["c","d"]], words = ["abcb"]
Output: []
 

Constraints:

m == board.length
n == board[i].length
1 <= m, n <= 12
board[i][j] is a lowercase English letter.
1 <= words.length <= 3 * 104
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
All the strings of words are unique.
 */
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
