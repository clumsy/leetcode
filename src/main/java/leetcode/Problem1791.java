package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.CONSTRUCTIVE)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1791 {
    public int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];
        if (first[0] == second[0] || first[0] == second[1]) {
            return first[0];
        }
        return first[1];
    }
}
