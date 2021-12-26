package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = 1;
            int i = -1;
            while ((i = sentence.indexOf(' ', i + 1)) > 0) {
                ++count;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
