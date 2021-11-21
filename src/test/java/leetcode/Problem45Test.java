package leetcode;

import org.junit.Test;

public class Problem45Test {
    private final Problem45 solution = new Problem45();

    @Test
    public void example1() {
        int[] jumps = {2,3,1,1,4};
        assert solution.jump(jumps) == 2;
    }

    @Test
    public void example2() {
        int[] jumps = {2,3,0,1,4};
        assert solution.jump(jumps) == 2;
    }

    @Test
    public void example3() {
        int[] jumps = {0};
        assert solution.jump(jumps) == 0;
    }

    @Test
    public void example4() {
        int[] jumps = {1};
        assert solution.jump(jumps) == 0;
    }

    @Test
    public void example5() {
        int[] jumps = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
        assert solution.jump(jumps) == 5;
    }

    @Test
    public void example6() {
        int[] jumps = {1,2,3};
        assert solution.jump(jumps) == 2;
    }

    @Test
    public void example7() {
        int[] jumps = {8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5};
        assert solution.jump(jumps) == 13;
    }

    @Test
    public void example8() {
        int[] jumps = {1,2};
        assert solution.jump(jumps) == 1;
    }

    @Test
    public void example9() {
        int[] jumps = {2,3,1};
        assert solution.jump(jumps) == 1;
    }
}
