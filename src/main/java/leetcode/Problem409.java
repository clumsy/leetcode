package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem409 {
    public int longestPalindrome(String s) {
        int[] freq = new int[256];
        char[] ss = s.toCharArray();
        for (char c : ss) {
            ++freq[c];
        }
        int odds = 0;
        for (int f : freq) {
            if ((f & 1) == 1) { // odd
                ++odds;
            }
        }
        // using all even, even number from odds and one extra odd in the middle
        return ss.length - odds + (odds > 0 ? 1 : 0);
    }
}
