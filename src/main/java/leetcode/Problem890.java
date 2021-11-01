package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>(words.length);
        int[] dictionary_to = new int[26];
        int[] dictionary_from = new int[26];
        for (String word : words) {
            if (match(dictionary_to, dictionary_from, pattern, word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean match(int[] dictionary_to, int[] dictionary_from, String pattern, String word) {
        if (pattern.length() != word.length()) {
            return false;
        }
        Arrays.fill(dictionary_to, 100);
        Arrays.fill(dictionary_from, 100);
        for (int i = 0; i < pattern.length(); i++) {
            int pc = pattern.charAt(i) - 'a';
            int wc = word.charAt(i) - 'a';
            if (dictionary_to[wc] < 100) { // already mapped
                if (dictionary_to[wc] != pc) {
                    return false; // but differs
                }
                continue; // and matches
            }
            if (dictionary_from[pc] < 100) {
                return false; // mapped to different
            }
            dictionary_to[wc] = pc; // map
            dictionary_from[pc] = wc; // map
        }
        return true;
    }
}
