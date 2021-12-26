package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.COUNTING_SORT)
@BeatsPercent(99.64)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1561 {
    public int maxCoins(int[] piles) {
        int[] count = new int[10000 + 1];
        for (int pile : piles) {
            ++count[pile];
        }
        for (int i = 0, j = 0; i < count.length; ++i) {
            while (count[i]-- > 0) {
                piles[j++] = i;
            }
        }
        int answer = 0;
        for (int i = piles.length - 2, k = 0; i > k; i -= 2, ++k) {
            answer += piles[i];
        }
        return answer;
    }
}
