
/*
1126. Word Ladder II
Hard
5.8K
713
Companies
A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

Every adjacent pair of words differs by a single letter.
Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
sk == endWord
Given two words, beginWord and endWord, and a dictionary wordList, return all the shortest transformation sequences from beginWord to endWord, or an empty list if no such sequence exists. Each sequence should be returned as a list of the words [beginWord, s1, s2, ..., sk].

 

Example 1:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
Output: [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
Explanation: There are 2 shortest transformation sequences:
"hit" -> "hot" -> "dot" -> "dog" -> "cog"
"hit" -> "hot" -> "lot" -> "log" -> "cog"
Example 2:

Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
Output: []
Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 

Constraints:

1 <= beginWord.length <= 5
endWord.length == beginWord.length
1 <= wordList.length <= 500
wordList[i].length == beginWord.length
beginWord, endWord, and wordList[i] consist of lowercase English letters.
beginWord != endWord
All the words in wordList are unique.
The sum of all shortest transformation sequences does not exceed 105.
 */
import java.util.*;

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordList);
        
        // Check if endWord is in the wordList
        if (!wordSet.contains(endWord)) {
            return result; // endWord is not in wordList, no valid transformation sequence
        }

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> distance = new HashMap<>();
        bfs(beginWord, endWord, wordSet, graph, distance);

        List<String> path = new ArrayList<>(Arrays.asList(beginWord));
        dfs(beginWord, endWord, graph, distance, path, result);

        return result;
    }

    // Breadth-First Search to build the graph and calculate distances
    private void bfs(String beginWord, String endWord, Set<String> wordSet, Map<String, List<String>> graph, Map<String, Integer> distance) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        distance.put(beginWord, 0);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundEnd = false;

            Set<String> visitedLevel = new HashSet<>();

            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                int currentDistance = distance.get(currentWord);

                List<String> neighbors = getNeighbors(currentWord, wordSet);
                for (String neighbor : neighbors) {
                    graph.computeIfAbsent(currentWord, k -> new ArrayList<>()).add(neighbor);

                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor, currentDistance + 1);
                        if (neighbor.equals(endWord)) {
                            foundEnd = true;
                        } else {
                            queue.offer(neighbor);
                            visitedLevel.add(neighbor);
                        }
                    }
                }
            }

            wordSet.removeAll(visitedLevel);

            if (foundEnd) {
                break;
            }
        }
    }

    // Get neighbors of a word by changing one letter at a time
    private List<String> getNeighbors(String word, Set<String> wordSet) {
        List<String> neighbors = new ArrayList<>();
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char originalChar = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c != originalChar) {
                    chars[i] = c;
                    String newWord = new String(chars);
                    if (wordSet.contains(newWord)) {
                        neighbors.add(newWord);
                    }
                }
            }
            chars[i] = originalChar;
        }

        return neighbors;
    }

    // Depth-First Search to find all shortest transformation sequences
    private void dfs(String currentWord, String endWord, Map<String, List<String>> graph, Map<String, Integer> distance, List<String> path, List<List<String>> result) {
        if (currentWord.equals(endWord)) {
            result.add(new ArrayList<>(path));
            return;
        }

        List<String> neighbors = graph.getOrDefault(currentWord, Collections.emptyList());

        for (String neighbor : neighbors) {
            if (distance.get(neighbor) == distance.get(currentWord) + 1) {
                path.add(neighbor);
                dfs(neighbor, endWord, graph, distance, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
}
