package leetcode;

import org.junit.Test;

public class Problem771Test {
    private final Problem771 solution = new Problem771();
    
    @Test
    public void example1() {
        assert solution.numJewelsInStones("aA", "aAAbbbb") == 3;
    }
    
    @Test
    public void example2() {
        assert solution.numJewelsInStones("z", "ZZ") == 0;
    }
}
