package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem427Test {
    private final Problem427 solution = new Problem427();
    
    @Test
    public void example1() {
        int[][] grid = {
            {0,1},
            {1,0},
        };
        assert Objects.equals(solution.construct(grid),
            solution.new Node(true, false,
                solution.new Node(false, true),
                solution.new Node(true, true),
                solution.new Node(true, true),
                solution.new Node(false, true)));
    }
    
    @Test
    public void example2() {
        int[][] grid = {
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
            {1,1,1,1,0,0,0,0},
        };
        assert Objects.equals(solution.construct(grid),
            solution.new Node(true, false,
                solution.new Node(true, true),
                solution.new Node(true, false,
                    solution.new Node(false, true),
                    solution.new Node(false, true),
                    solution.new Node(true, true),
                    solution.new Node(true, true)),
                solution.new Node(true, true),
                solution.new Node(false, true)));
    }
}
