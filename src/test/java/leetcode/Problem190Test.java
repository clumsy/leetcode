package leetcode;

import org.junit.Test;

public class Problem190Test {
    private final Problem190 solution = new Problem190();

    @Test
    public void example1() {
        int n = 0b00000010100101000001111010011100;
        assert solution.reverseBits(n) == 0b00111001011110000010100101000000;
    }

    @Test
    public void example2() {
        int n = 0b11111111111111111111111111111101;
        assert solution.reverseBits(n) == 0b10111111111111111111111111111111;
    }
}
