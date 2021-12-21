package leetcode;

import org.junit.Test;

public class Problem1832Test {
    private final Problem1832 solution = new Problem1832();
    
    @Test
    public void example1() {
        assert solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
    
    @Test
    public void example2() {
        assert !solution.checkIfPangram("leetcode");
    }
}
