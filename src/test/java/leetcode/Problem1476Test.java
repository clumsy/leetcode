package leetcode;

import org.junit.Test;

public class Problem1476Test {
    private final Problem1476 solution = new Problem1476();
    
    @Test
    public void example1() {
        int[][] rectangle = {
            {1,2,1},
            {4,3,4},
            {3,2,1},
            {1,1,1},
        };
        Problem1476.SubrectangleQueries subrectangleQueries = solution.new SubrectangleQueries(rectangle);
        assert subrectangleQueries.getValue(0,2) == 1;
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        assert subrectangleQueries.getValue(0, 2) == 5;
        assert subrectangleQueries.getValue(3, 1) == 5;
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        assert subrectangleQueries.getValue(3, 1) == 10;
        assert subrectangleQueries.getValue(0, 2) == 5;
    }
    
    @Test
    public void example2() {
        int[][] rectangle = {
            {1,1,1},
            {2,2,2},
            {3,3,3},
        };
        Problem1476.SubrectangleQueries subrectangleQueries = solution.new SubrectangleQueries(rectangle);
        assert subrectangleQueries.getValue(0, 0) == 1;
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        assert subrectangleQueries.getValue(0, 0) == 100;
        assert subrectangleQueries.getValue(2, 2) == 100;
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        assert subrectangleQueries.getValue(2, 2) == 20;
    }
}
