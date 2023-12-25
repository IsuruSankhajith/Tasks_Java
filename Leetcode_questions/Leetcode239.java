
/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length

 */
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements as they won't affect the result
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element to the deque
            deque.offer(i);

            // Add the maximum element to the result array for the current window
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }

        return result;
    }
}
////////////////
import java.util.ArrayDeque;
import java.util.Deque;

class MaxSlidingWindow {

    private int[] nums;
    private int k;
    private int[] result;

    public MaxSlidingWindow(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
        this.result = new int[nums.length - k + 1];
    }

    public int[] maxSlidingWindow() {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int ri = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements outside of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements as they won't affect the result
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element to the deque
            deque.offer(i);

            // Add the maximum element to the result array for the current window
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        MaxSlidingWindow solution1 = new MaxSlidingWindow(nums1, k1);
        int[] result1 = solution1.maxSlidingWindow();
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {1};
        int k2 = 1;
        MaxSlidingWindow solution2 = new MaxSlidingWindow(nums2, k2);
        int[] result2 = solution2.maxSlidingWindow();
        System.out.println(Arrays.toString(result2));
    }
}
