package leetcode;

import org.junit.Test;

public class Problem1332Test {
    private final Problem1332 solution = new Problem1332();
    
    @Test
    public void example1() {
        assert solution.removePalindromeSub("ababa") == 1;
    }
    
    @Test
    public void example2() {
        assert solution.removePalindromeSub("abb") == 2;
    }
    
    @Test
    public void example3() {
        assert solution.removePalindromeSub("baabb") == 2;
    }
    
    @Test
    public void example4() {
        assert solution.removePalindromeSub("bbaabaaa") == 2;
    }
    
    @Test
    public void example5() {
        assert solution.removePalindromeSub("babababbababab") == 1;
    }
}
