package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem986Test {
    private final Problem986 solution = new Problem986();
    
    @Test
    public void example1() {
        int[][] firstList = {
            {0,2},{5,10},{13,23},{24,25}
        };
        int[][] secondList = {
            {1,5},{8,12},{15,24},{25,26}
        };
        assert Arrays.deepEquals(solution.intervalIntersection(firstList, secondList),
            new int[][] {
                {1,2},{5,5},{8,10},{15,23},{24,24},{25,25}  
            });
    }
    
    @Test
    public void example2() {
        int[][] firstList = {
            {1,3},{5,9}
        };
        int[][] secondList = {};
        assert Arrays.deepEquals(solution.intervalIntersection(firstList, secondList), secondList);
    }
    
    @Test
    public void example3() {
        int[][] firstList = {};
        int[][] secondList = {
            {4,8},{10,12}
        };
        assert Arrays.deepEquals(solution.intervalIntersection(firstList, secondList), firstList);
    }
    
    @Test
    public void example4() {
        int[][] firstList = {
            {1,7}
        };
        int[][] secondList = {
            {3,10}
        };
        assert Arrays.deepEquals(solution.intervalIntersection(firstList, secondList),
            new int[][] {
                {3,7}
            });
    }
}
