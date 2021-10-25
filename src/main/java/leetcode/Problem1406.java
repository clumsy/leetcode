package leetcode;

@Difficulty(Level.HARD)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1406 {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int take = 0;
        int take_one = 0;
        int take_two = 0;
        int take_three = 0;
        for (int i = n - 1; i >= 0; i--) {
            take += stoneValue[i];
            int min = Math.min(take_one, Math.min(take_two, take_three));
            take_three = take_two;
            take_two = take_one;
            take_one = take - min;
        }
        int alice = take_one;
        int bob = take - alice;
        if (alice > bob) {
            return "Alice";
        }
        if (bob > alice) {
            return "Bob";
        }
        return "Tie";
    }
}
