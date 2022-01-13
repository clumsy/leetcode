package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.ELIMINATION)
@BeatsPercent(60.66)
@TimeComplexity(worst = Complexity.N_BY_M) // where N and M is the valid range for X and Y coordinates respectively 
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1237 {
    interface CustomFunction {
        int f(int x, int y);
    }
    
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        int x = 1, y = 1000;
        while (x <= 1000 && y >= 1) {
            int val = customfunction.f(x,y);
            if (val > z) {
                --y;
            } else if (val < z) {
                ++x;
            } else {
                result.add(Arrays.asList(x++, y--));
            }
        }
        return result;
    }
}
