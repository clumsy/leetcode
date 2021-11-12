package leetcode;

import org.junit.Test;

public class Problem844Test {
    private final Problem844 solution = new Problem844();
    
    @Test
    public void example1() {
        assert solution.backspaceCompare("ab#c", "ad#c");
    }
    
    @Test
    public void example2() {
        assert solution.backspaceCompare("ab##", "c#d#");
    }
    
    @Test
    public void example3() {
        assert solution.backspaceCompare("a##c", "#a#c");
    }
    
    @Test
    public void example4() {
        assert !solution.backspaceCompare("a#c", "b");
    }
    
    @Test
    public void example5() {
        assert solution.backspaceCompare("bxj##tw", "bxo#j##tw");
    }
    
    @Test
    public void example6() {
        assert !solution.backspaceCompare("bbbextm", "bbb#extm");
    }
}
