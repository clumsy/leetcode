package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem1431Test {
    private final Problem1431 solution = new Problem1431();
    
    @Test
    public void example1() {
        int[] candies = {2,3,5,1,3};
        assert Objects.equals(solution.kidsWithCandies(candies, 3),
            Arrays.asList(true,true,true,false,true));
    }
    
    @Test
    public void example2() {
        int[] candies = {4,2,1,1,2};
        assert Objects.equals(solution.kidsWithCandies(candies, 1),
            Arrays.asList(true,false,false,false,false));
    }
    
    @Test
    public void example3() {
        int[] candies = {12,1,12};
        assert Objects.equals(solution.kidsWithCandies(candies, 10),
            Arrays.asList(true,false,true));
    }
}
