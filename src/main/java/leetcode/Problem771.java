package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SET)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem771 {
    public int numJewelsInStones(String jewels, String stones) {
        int[] jewel = new int[256];
        for (char j : jewels.toCharArray()) {
            jewel[j]++;
        }
        int count = 0;
        for (char s : stones.toCharArray()) {
            count += jewel[s];
        }
        return count;
    }
}
