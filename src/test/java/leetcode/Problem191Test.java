package leetcode;

import org.junit.Test;

public class Problem191Test {
    private final Problem191 solution = new Problem191();

    @Test
    public void example1() {
        assert solution.hammingWeight(0b00000000000000000000000000001011) == 3;
    }

    @Test
    public void example2() {
        assert solution.hammingWeight(0b00000000000000000000000010000000) == 1;
    }

    @Test
    public void example3() {
        assert solution.hammingWeight(0b11111111111111111111111111111101) == 31;
    }
}
