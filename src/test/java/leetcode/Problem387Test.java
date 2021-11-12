package leetcode;

import org.junit.Test;

public class Problem387Test {
    private final Problem387 solution = new Problem387();
    
    @Test
    public void example1() {
        assert solution.firstUniqChar("leetcode") == 0;
    }
    
    @Test
    public void example2() {
        assert solution.firstUniqChar("loveleetcode") == 2;
    }
    
    @Test
    public void example3() {
        assert solution.firstUniqChar("aabb") == -1;
    }
}
