package leetcode;

import org.junit.Test;

public class Problem33Test {
    private final Problem33 solution = new Problem33();

    @Test
    public void example1() {
        int[] nums = {4,5,6,7,0,1,2};
        assert solution.search(nums, 0) == 4;
    }

    @Test
    public void example2() {
        int[] nums = {4,5,6,7,0,1,2};
        assert solution.search(nums, 3) == -1;
    }

    @Test
    public void example3() {
        int[] nums = {};
        assert solution.search(nums, 5) == -1;
    }

    @Test
    public void example4() {
        int[] nums = {1};
        assert solution.search(nums, 0) == -1;
    }

    @Test
    public void example5() {
        int[] nums = {4,5,6,7,0,1,2};
        assert solution.search(nums, 0) == 4;
    }

    @Test
    public void example6() {
        int[] nums = {1,3,5};
        assert solution.search(nums, 3) == 1;
    }

    @Test
    public void example7() {
        int[] nums = {7,8,1,2,3,4,5,6};
        assert solution.search(nums, 2) == 3;
    }

    @Test
    public void example8() {
        int[] nums = {4,5,6,7,0,1,2};
        assert solution.search(nums, 5) == 1;
    }
}
