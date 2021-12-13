package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1446 {
    public int maxPower(String s) {
        int max = 0;
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length - max; ) {
            int count = 1;
            char c = ss[i];
            while (++i < ss.length && ss[i] == c) {
                ++count;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
