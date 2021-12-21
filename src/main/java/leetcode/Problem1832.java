package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1832 {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int contains = 0;
        for (char c : sentence.toCharArray()) {
            contains |= 1 << (c - 'a');
        }
        return contains == (1 << 26) - 1;
    }
}
