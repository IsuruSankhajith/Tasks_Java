
/*
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

Example 1:

Input: s = "1 + 1"
Output: 2
Example 2:

Input: s = " 2-1 + 2 "
Output: 3
Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
 

Constraints:

1 <= s.length <= 3 * 105
s consists of digits, '+', '-', '(', ')', and ' '.
s represents a valid expression.
'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
There will be no two consecutive operators in the input.
Every number and running calculation will fit in a signed 32-bit integer.
 */
import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1; // 1 represents positive, -1 represents negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // pop sign
                result += stack.pop(); // pop result
            }
        }

        result += sign * num;

        return result;
    }
}
///////////////

import java.util.Stack;

class Calculator {
    private Stack<Integer> stack;
    private int num;
    private int result;
    private int sign;

    public Calculator() {
        this.stack = new Stack<>();
        this.num = 0;
        this.result = 0;
        this.sign = 1;
    }

    public int calculate(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            processCharacter(c);
        }

        result += sign * num;
        return result;
    }

    private void processCharacter(char c) {
        if (Character.isDigit(c)) {
            num = num * 10 + (c - '0');
        } else if (c == '+') {
            result += sign * num;
            num = 0;
            sign = 1;
        } else if (c == '-') {
            result += sign * num;
            num = 0;
            sign = -1;
        } else if (c == '(') {
            stack.push(result);
            stack.push(sign);
            result = 0;
            sign = 1;
        } else if (c == ')') {
            result += sign * num;
            num = 0;
            result *= stack.pop(); // pop sign
            result += stack.pop(); // pop result
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example 1
        System.out.println(calculator.calculate("1 + 1")); // Output: 2

        // Example 2
        System.out.println(calculator.calculate(" 2-1 + 2 ")); // Output: 3

        // Example 3
        System.out.println(calculator.calculate("(1+(4+5+2)-3)+(6+8)")); // Output: 23
    }
}