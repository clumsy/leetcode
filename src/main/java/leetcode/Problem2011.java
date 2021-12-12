package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(78.94)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2011 {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ++value;
            } else {
                --value;
            }
        }
        return value;
    }
}
