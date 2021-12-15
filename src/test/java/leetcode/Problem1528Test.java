package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1528Test {
    private final Problem1528 solution = new Problem1528();
    
    @Test
    public void example1() {
        int[] indices = {4,5,6,7,0,2,1,3};
        assert Objects.equals(solution.restoreString("codeleet", indices), "leetcode");
    }
    
    @Test
    public void example2() {
        int[] indices = {0,1,2};
        assert Objects.equals(solution.restoreString("abc", indices), "abc");
    }
    
    @Test
    public void example3() {
        int[] indices = {3,1,4,2,0};
        assert Objects.equals(solution.restoreString("aiohn", indices), "nihao");
    }
    
    @Test
    public void example4() {
        int[] indices = {4,0,2,6,7,3,1,5};
        assert Objects.equals(solution.restoreString("aaiougrt", indices), "arigatou");
    }
    
    @Test
    public void example5() {
        int[] indices = {1,0,2};
        assert Objects.equals(solution.restoreString("art", indices), "rat");
    }
}
