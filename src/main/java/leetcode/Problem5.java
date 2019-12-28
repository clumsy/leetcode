package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem5 {
    public static String longestPalindrome(final String s) {
        Map<Character, List<Integer>> map = positions(s);
        String max = "";
        for (int i = 0, length = s.length(); i < length; i++) {
            if (max.length() >= length - i) {
                break;
            }
            char ch = s.charAt(i);
            List<Integer> positions = map.get(ch);
            for (int k = positions.size() - 1; k >= 0; k--) {
                int j = positions.get(k);
                if (max.length() >= j + 1 - i) {
                    break;
                }
                if (isPalindrome(s, i, j + 1)) {
                    max = s.substring(i, j + 1);
                    break;
                }
            }
        }
        return max;
    }

    private static boolean isPalindrome(final String s, final int start, final int end) {
        int length = end - start;
        if (length == 1) {
            return true;
        }
        for (int i = 0, middle = (length - 1)/2; i <= middle; i++) {
            if (s.charAt(start + i) != s.charAt(end - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, List<Integer>> positions(final String s) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0, length = s.length(); i < length; i++) {
            char ch = s.charAt(i);
            int j = i;
            map.compute(ch, (c, list) -> {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(j);
                return list;
            });
        }
        return map;
    }
}
