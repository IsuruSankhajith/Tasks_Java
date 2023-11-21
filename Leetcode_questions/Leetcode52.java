
/*
52. N-Queens II
Hard
3.7K
253
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9

*/
class Solution {
    public int totalNQueens(int n) {
        int[] result = new int[1];
        int[] queens = new int[n];  // queens[i] represents the column number of the queen in row i
        solveNQueens(n, 0, queens, result);
        return result[0];
    }

    private void solveNQueens(int n, int row, int[] queens, int[] result) {
        if (row == n) {
            result[0]++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(row, col, queens)) {
                queens[row] = col;
                solveNQueens(n, row + 1, queens, result);
            }
        }
    }

    private boolean isValid(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
