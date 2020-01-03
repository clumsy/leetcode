package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem5 {
    public static final class Alternative extends Problem5 {

        @Override
        public String longestPalindrome(final String s) {
            if (s.isEmpty()) {
                return "";
            }
            String max = "" + s.charAt(0);
            for (int i = 0, length = s.length() - 1; i < length; i++) {
                int oddSized = expandFromMiddle(s, i, i);
                int evenSized = expandFromMiddle(s, i, i + 1);
                if (oddSized < max.length() && evenSized < max.length()) {
                    continue;
                }
                if (oddSized >= evenSized) {
                    int half = oddSized/2;
                    max = s.substring(i - half, i + half + 1);
                } else {
                    int half = evenSized/2;
                    max = s.substring(i - half + 1, i + half + 1);
                }
            }
            return max;
        }

        private static int expandFromMiddle(final String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1;
        }
    }

    public String longestPalindrome(final String s) {
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
