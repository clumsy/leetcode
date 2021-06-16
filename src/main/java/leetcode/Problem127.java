package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@BeatsPercent(98.89)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        Set<String> allWords = new HashSet<>(n, 1);
        for (String word : wordList) {
            allWords.add(word);
        }
        if (!allWords.remove(endWord)) {
            return 0; // endWord is not present, no path possible
        }
        allWords.remove(beginWord);

        Set<String> start = new HashSet<>();
        start.add(beginWord);
        Set<String> end = new HashSet<>();
        end.add(endWord);
        int length = 2; // + beginWord, + endWord
        while (!start.isEmpty()) {
            if (start.size() > end.size()) { // making twice faster by going both ways
                Set<String> tmp = start;
                start = end;
                end = tmp;
            }
            Set<String> next = new HashSet<>();
            for (String word : start) {
                for (int i = 0; i < word.length(); i++) {
                    char[] chars = word.toCharArray();
                    char old = chars[i];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String candidate = String.valueOf(chars);
                        if (end.remove(candidate)) { // check if word variation finishes the path
                            return length;
                        }
                        if (allWords.remove(candidate)) { // check if word variation present
                            next.add(candidate);
                        }
                    }
                    chars[i] = old;
                }
            }
            start = next;
            length++;
        }
        return 0;
    }
}
