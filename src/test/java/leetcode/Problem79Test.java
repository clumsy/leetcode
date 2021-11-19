package leetcode;

import org.junit.Test;

public class Problem79Test {
    private final Problem79 solution = new Problem79();
    
    @Test
    public void example1() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
        };
        assert solution.exist(board, "ABCCED");
    }
    
    @Test
    public void example2() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
        };
        assert solution.exist(board, "SEE");
    }
    
    @Test
    public void example3() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
        };
        assert !solution.exist(board, "ABCB");
    }
    
    @Test
    public void example4() {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','E','S'},
            {'A','D','E','E'},
        };
        assert solution.exist(board, "ABCESEEEFS");
    }
}
