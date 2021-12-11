package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem451Test {
    private final Problem451 solution = new Problem451();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.frequencySort("tree"), "eert");
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.frequencySort("cccaaa"), "aaaccc");
    }
    
    @Test
    public void example3() {
        assert Objects.equals(solution.frequencySort("Aabb"), "bbAa");
    }
}
