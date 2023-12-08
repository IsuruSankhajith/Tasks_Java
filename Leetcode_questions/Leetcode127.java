
/*
127. Word Ladder
Hard
11.5K
1.8K
Companies
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.

 

Example 1:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: 5
Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
Example 2:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: 0
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 

Constraints:

1 <= beginWord.length <= 10
endWord.length == beginWord.length
1 <= wordList.length <= 5000
wordList[i].length == beginWord.length
beginWord, endWord, and wordList[i] consist of lowercase English letters.
beginWord != endWord
All the words in wordList are unique.
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Create a set for efficient word lookup
        Set<String> wordSet = new HashSet<>(wordList);

        // Check if endWord is in the wordList; if not, transformation sequence is not possible
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        // Use a queue for BFS and initialize level to 1
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        // BFS loop
        while (!queue.isEmpty()) {
            int size = queue.size();

            // Explore all words at the current level
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                char[] wordChars = currentWord.toCharArray();

                // Try changing each character of the word
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];

                    // Try all possible characters from 'a' to 'z'
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) {
                            continue; // Skip the same character
                        }

                        wordChars[j] = c;
                        String transformedWord = new String(wordChars);

                        // If transformedWord is the endWord, return the length of the sequence
                        if (transformedWord.equals(endWord)) {
                            return level + 1; // Transformation sequence found
                        }

                        // If the transformed word is in the wordSet, add it to the queue
                        if (wordSet.contains(transformedWord)) {
                            queue.offer(transformedWord);
                            wordSet.remove(transformedWord); // Mark the word as visited
                        }
                    }

                    wordChars[j] = originalChar; // Revert back the change
                }
            }

            level++; // Move to the next level
        }

        return 0; // No transformation sequence found
    }
}

