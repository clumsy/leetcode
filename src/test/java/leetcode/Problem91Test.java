package leetcode;

import org.junit.Test;

public class Problem91Test {
    private final Problem91 solution = new Problem91();

    @Test
    public void example1() {
        assert solution.numDecodings("12") == 2;
    }

    @Test
    public void example2() {
        assert solution.numDecodings("226") == 3;
    }

    @Test
    public void example3() {
        assert solution.numDecodings("0") == 0;
    }

    @Test
    public void example4() {
        assert solution.numDecodings("06") == 0;
    }

    @Test
    public void example5() {
        assert solution.numDecodings("1201234") == 3;
    }

    @Test
    public void example6() {
        assert solution.numDecodings("123123") == 9;
    }

    @Test
    public void example7() {
        assert solution.numDecodings("207") == 1;
    }

    @Test
    public void example8() {
        assert solution.numDecodings("230") == 0;
    }
}
