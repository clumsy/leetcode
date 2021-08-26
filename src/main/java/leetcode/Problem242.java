package leetcode;

@BeatsPercent(41.25)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where N and M are the lengths of the input strings
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            ++counts[c - 'a'];
        }
        for (char c : t.toCharArray()) {
            --counts[c - 'a'];
        }
        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
