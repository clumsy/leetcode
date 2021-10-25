package leetcode;

import org.junit.Test;

public class Problem278Test {
    
    @Test
    public void example1() {
        assert new Problem278(4).firstBadVersion(5) == 4;
    }
    
    @Test
    public void example2() {
        assert new Problem278(1).firstBadVersion(1) == 1;
    }
}
