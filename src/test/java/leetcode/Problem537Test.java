package leetcode;

import org.junit.Test;

public class Problem537Test {
    private final Problem537 solution = new Problem537();
    
    @Test
    public void example1() {
        assert solution.complexNumberMultiply("1+1i", "1+1i").equals("0+2i");
    }
    
    @Test
    public void example2() {
        assert solution.complexNumberMultiply("1+-1i", "1+-1i").equals("0+-2i");
    }
}
