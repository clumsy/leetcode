package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1678Test {
    private final Problem1678 solution = new Problem1678();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.interpret("G()(al)"), "Goal");
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.interpret("G()()()()(al)"), "Gooooal");
    }
    
    @Test
    public void example3() {
        assert Objects.equals(solution.interpret("(al)G(al)()()G"), "alGalooG");
    }
}
