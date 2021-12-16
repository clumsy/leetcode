package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
