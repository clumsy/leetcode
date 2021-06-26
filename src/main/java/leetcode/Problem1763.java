package leetcode;

import java.util.HashSet;
import java.util.Set;

@BeatsPercent(92.62)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1763 {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) {
            return "";
        }
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: arr) {
            set.add(c);
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!set.contains(Character.toUpperCase(c)) || !set.contains(Character.toLowerCase(c))) {
                // there's a character for which either lower or upper case variant is missing
                // longest nice substring can only be on the left or right
                String sub1 = longestNiceSubstring(s.substring(0, i));
                String sub2 = longestNiceSubstring(s.substring(i + 1));
                return sub1.length() >= sub2.length() ? sub1 : sub2;
            }
        }
        return s; // this string should already be the longest
    }
}
