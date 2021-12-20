package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is the sum of all word lengths
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] mask = new boolean[26];
        for (int i = 0, n = allowed.length(); i < n; ++i) {
            mask[allowed.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            count += consistent(word, mask) ? 1 : 0;
        }
        return count;
    }

    private boolean consistent(String word, boolean[] mask) {
        for (int i = 0, n = word.length(); i < n; ++i) {
            if (!mask[word.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}
