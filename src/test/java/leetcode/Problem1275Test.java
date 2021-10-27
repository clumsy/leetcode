package leetcode;

import org.junit.Test;

public class Problem1275Test {
    private final Problem1275 solution = new Problem1275();
    
    @Test
    public void example1() {
        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        assert solution.tictactoe(moves).equals("A");
    }
    
    @Test
    public void example2() {
        int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        assert solution.tictactoe(moves).equals("B");
    }
    
    @Test
    public void example3() {
        int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        assert solution.tictactoe(moves).equals("Draw");
    }
    
    @Test
    public void example4() {
        int[][] moves = {{0,0},{1,1}};
        assert solution.tictactoe(moves).equals("Pending");
    }
}
