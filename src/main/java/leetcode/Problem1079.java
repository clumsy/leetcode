package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BACKTRACKING)
@BeatsPercent(91.30)
@TimeComplexity(worst = Complexity.EXPONENTIAL_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // the call stack depth
public class Problem1079 {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            ++count[c - 'A'];
        }
        return dfs(count);
    }

    private int dfs(int[] count) {
        int sum = 0;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] != 0) {
                ++sum;
                --count[i];
                sum += dfs(count);
                ++count[i];
            }
        }
        return sum;
    }
}
