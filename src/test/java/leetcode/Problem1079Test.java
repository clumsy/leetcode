package leetcode;

import org.junit.Test;

public class Problem1079Test {
    private final Problem1079 solution = new Problem1079();
    
    @Test
    public void example1() {
        assert solution.numTilePossibilities("AAB") == 8;
    }
    
    @Test
    public void example2() {
        assert solution.numTilePossibilities("AAABBC") == 188;
    }
    
    @Test
    public void example3() {
        assert solution.numTilePossibilities("V") == 1;
    }
}
