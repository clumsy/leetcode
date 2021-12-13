package leetcode;

import org.junit.Test;

public class Problem1446Test {
    private final Problem1446 solution = new Problem1446();
    
    @Test
    public void example1() {
        assert solution.maxPower("leetcode") == 2;
    }
    
    @Test
    public void example2() {
        assert solution.maxPower("abbcccddddeeeeedcba") == 5;
    }
    
    @Test
    public void example3() {
        assert solution.maxPower("triplepillooooow") == 5;
    }
    
    @Test
    public void example4() {
        assert solution.maxPower("hooraaaaaaaaaaay") == 11;
    }
    
    @Test
    public void example5() {
        assert solution.maxPower("tourist") == 1;
    }
    
    @Test
    public void example6() {
        assert solution.maxPower("j") == 1;
    }
}
