package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(99.85)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[] prev = new int[256];
        char[] ss = s.toCharArray();
        for (int i = 0, last = 0; i < ss.length; i++) {
            last = Math.max(last, prev[ss[i]]);
            max = Math.max(max, i + 1 - last);
            prev[ss[i]] = i + 1;
        }
        return max;
    }
}
