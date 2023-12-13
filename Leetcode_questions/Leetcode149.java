
/*
149. Max Points on a Line
Hard
4K
453
Companies
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

 

Example 1:


Input: points = [[1,1],[2,2],[3,3]]
Output: 3
Example 2:


Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4
 

Constraints:

1 <= points.length <= 300
points[i].length == 2
-104 <= xi, yi <= 104
All the points are unique.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> memo = new HashMap<>();
        return wordBreakHelper(s, 0, wordDict, memo);
    }

    private List<String> wordBreakHelper(String s, int start, List<String> wordDict, Map<Integer, List<String>> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        List<String> result = new ArrayList<>();
        if (start == s.length()) {
            result.add("");
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                List<String> nextWords = wordBreakHelper(s, end, wordDict, memo);
                for (String nextWord : nextWords) {
                    result.add(word + (nextWord.isEmpty() ? "" : " " + nextWord));
                }
            }
        }

        memo.put(start, result);
        return result;
    }
}
