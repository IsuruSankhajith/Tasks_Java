////////////////////////////////////////////////////////////////////
//1
////////////////////////////////////////////////////////////////
/*
1441. Build an Array With Stack Operations
Medium
647
295
Companies
You are given an integer array target and an integer n.

You have an empty stack with the two following operations:

"Push": pushes an integer to the top of the stack.
"Pop": removes the integer on the top of the stack.
You also have a stream of the integers in the range [1, n].

Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to target. You should follow the following rules:

If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.
If the stack is not empty, pop the integer at the top of the stack.
If, at any moment, the elements in the stack (from the bottom to the top) are equal to target, do not read new integers from the stream and do not do more operations on the stack.
Return the stack operations needed to build target following the mentioned rules. If there are multiple valid answers, return any of them.

 

Example 1:

Input: target = [1,3], n = 3
Output: ["Push","Push","Pop","Push"]
Explanation: Initially the stack s is empty. The last element is the top of the stack.
Read 1 from the stream and push it to the stack. s = [1].
Read 2 from the stream and push it to the stack. s = [1,2].
Pop the integer on the top of the stack. s = [1].
Read 3 from the stream and push it to the stack. s = [1,3].
Example 2:

Input: target = [1,2,3], n = 3
Output: ["Push","Push","Push"]
Explanation: Initially the stack s is empty. The last element is the top of the stack.
Read 1 from the stream and push it to the stack. s = [1].
Read 2 from the stream and push it to the stack. s = [1,2].
Read 3 from the stream and push it to the stack. s = [1,2,3].
Example 3:

Input: target = [1,2], n = 4
Output: ["Push","Push"]
Explanation: Initially the stack s is empty. The last element is the top of the stack.
Read 1 from the stream and push it to the stack. s = [1].
Read 2 from the stream and push it to the stack. s = [1,2].
Since the stack (from the bottom to the top) is equal to target, we stop the stack operations.
The answers that read integer 3 from the stream are not accepted.
 

Constraints:

1 <= target.length <= 100
1 <= n <= 100
1 <= target[i] <= n
target is strictly increasing.
 
*/
----------------
import java.util.ArrayList;
import java.util.List;

public class Solution  {
    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>(); // Create a list to store the stack operations
        int targetIndex = 0; // Initialize an index to keep track of the current position in the target array

        for (int i = 1; i <= n; i++) {
            if (targetIndex == target.length) {
                // If we have processed all elements in the target array, exit the loop
                break;
            }
            result.add("Push"); // Add "Push" operation to the result list

            if (i == target[targetIndex]) {
                // If the current integer matches the target, move to the next target element
                targetIndex++;
            } else {
                result.add("Pop"); // Add "Pop" operation to the result list
            }
        }

        return result; // Return the list of stack operations
    }

    public static void main(String[] args) {
    // Example 1:
    int[] target1 = {1, 3};
    int n1 = 3;
    List<String> result1 = buildArray(target1, n1);
    System.out.println(result1);  // Output: ["Push", "Push", "Pop", "Push"]

    // Example 2:
    int[] target2 = {1, 2, 3};
    int n2 = 3;
    List<String> result2 = buildArray(target2, n2);
    System.out.println(result2);  // Output: ["Push", "Push", "Push"]

    // Example 3:
    int[] target3 = {1, 2};
    int n3 = 4;
    List<String> result3 = buildArray(target3, n3);
    System.out.println(result3);  // Output: ["Push", "Push"]
    }
}

