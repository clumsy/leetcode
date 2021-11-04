package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static leetcode.Asserts.assertEquivalent;

public class Problem46Test {
    private final Problem46 solution = new Problem46();

    @Test
    public void example1() {
        assertEquivalent(solution.permute(new int[] {1,2,3}),
            Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)));
    }

    @Test
    public void example2() {
        assertEquivalent(solution.permute(new int[] {0,1}),
            Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1,0)));
    }

    @Test
    public void example3() {
        assertEquivalent(solution.permute(new int[] {1}),
            Arrays.asList(
                Arrays.asList(1)));
    }
}
