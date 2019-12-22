package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>(length, 1f);
        int max = 0;
        int count = 0;
        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);
            Integer prev = map.put(ch, i);
            if (prev == null || prev < i - count) {
                ++count;
            } else {
                max = Math.max(max, count);
                count = i - prev;
            }
        }
        return Math.max(max, count);
    }
}
