package leetcode;

import org.junit.Test;

public class Problem959Test {
    private final Problem959 solution = new Problem959();
    
    @Test
    public void example1() {
        assert solution.regionsBySlashes(new String[] {" /", "/ "}) == 2;
    }
    
    @Test
    public void example2() {
        assert solution.regionsBySlashes(new String[] {" /", "  "}) == 1;
    }
    
    @Test
    public void example3() {
        assert solution.regionsBySlashes(new String[] {"\\/", "/\\"}) == 4;
    }
    
    @Test
    public void example4() {
        assert solution.regionsBySlashes(new String[] {"/\\", "\\/"}) == 5;
    }
    
    @Test
    public void example5() {
        assert solution.regionsBySlashes(new String[] {"//", "/ "}) == 3;
    }
}
