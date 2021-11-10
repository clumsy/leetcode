package leetcode;

import java.util.Arrays;
import org.junit.Test;

public class Problem566Test {
    private final Problem566 solution = new Problem566();
    
    @Test
    public void example1() {
        int[][] mat = new int[][] {
            {1,2},
            {3,4}
        };
        assert Arrays.deepEquals(solution.matrixReshape(mat, 1, 4), new int[][] {
            {1,2,3,4}
        });
    }
    
    @Test
    public void example2() {
        int[][] mat = new int[][] {
            {1,2},
            {3,4}
        };
        assert Arrays.deepEquals(solution.matrixReshape(mat, 2, 4), mat);
    }
}
