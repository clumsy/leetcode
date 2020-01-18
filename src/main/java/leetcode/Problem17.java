package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem17 {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        char[][] digitLetters = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'},
        };
        List<String> result = Collections.singletonList("");
        for (char c : digits.toCharArray()) {
            result = getVariants(result, digitLetters[c - '2']);
        }
        return result;
    }

    private List<String> getVariants(List<String> current, char[] digits) {
        List<String> next = new ArrayList<>(current.size()*digits.length);
        for (String item : current) {
            for (char c : digits) {
                next.add(item + c);
            }
        }
        return next;
    }
}
