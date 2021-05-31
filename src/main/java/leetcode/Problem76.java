package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.N_PLUS_K)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem76 {
    public String minWindow(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        int[] map = new int[256];
        int end = 0;
        int start = 0;
        int min_length = Integer.MAX_VALUE;
        for (int i = 0; i < t_array.length; i++) {
            map[t_array[i]]++;
        }
        int need = t_array.length;
        int min_start = 0;
        while (end < s_array.length) {
            if (map[s_array[end]]-- > 0) { // check if we need this character to form the answer
                need--;
            }
            while (need == 0) { // while we have all the characters we need, find the shortest answer
                if ((end - start + 1) < min_length) {
                    min_length = end - start + 1;
                    min_start = start;
                }
                if (++map[s_array[start]] > 0) { // remove the leftmost character
                    need++;
                }
                start++;
            }
            end++;
        }
        int min_end = min_start + min_length;
        if (min_end > s_array.length) {
            return "";
        }
        return s.substring(min_start, min_end);
    }
}
