
/*
124. Binary Tree Maximum Path Sum
Hard
15.9K
692
Companies
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

 

Example 1:


Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
Example 2:


Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 

Constraints:

The number of nodes in the tree is in the range [1, 3 * 104].
-1000 <= Node.val <= 1000
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculateMaxPathSum(root);
        return maxPathSum;
    }

    private int calculateMaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Calculate the maximum path sum for the left and right subtrees
        int leftSum = Math.max(0, calculateMaxPathSum(node.left));
        int rightSum = Math.max(0, calculateMaxPathSum(node.right));

        // Update the global maximum path sum considering the current node
        maxPathSum = Math.max(maxPathSum, leftSum + rightSum + node.val);

        // Return the maximum path sum that goes through the current node and extends to its parent
        return Math.max(leftSum, rightSum) + node.val;
    }
}
