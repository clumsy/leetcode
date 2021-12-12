package leetcode;

import org.junit.Test;

public class Problem1108Test {
    private final Problem1108 solution = new Problem1108();
    
    @Test
    public void example1() {
        assert solution.defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1");
    }
    
    @Test
    public void example2() {
        assert solution.defangIPaddr("255.100.50.0").equals("255[.]100[.]50[.]0");
    }
}
