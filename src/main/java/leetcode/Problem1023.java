package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>(queries.length);
        for (String query : queries) {
            int patternLength = pattern.length();
            int patternIndex = 0;
            boolean match = true;
            for (char ch : query.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z' &&
                        (patternIndex >= patternLength || pattern.charAt(patternIndex) != ch)) {
                    match = false;
                    break;
                }
                if (patternIndex < patternLength && ch == pattern.charAt(patternIndex)) {
                    patternIndex++;
                }
            }
            result.add(match && patternIndex == patternLength);
        }
        return result;
    }
}
