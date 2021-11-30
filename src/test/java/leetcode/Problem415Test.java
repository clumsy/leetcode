package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem415Test {
    private final Problem415 solution = new Problem415();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.addStrings("11", "123"), "134");
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.addStrings("456", "77"), "533");
    }
    
    @Test
    public void example3() {
        assert Objects.equals(solution.addStrings("0", "0"), "0");
    }
}
