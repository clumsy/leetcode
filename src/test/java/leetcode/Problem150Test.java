package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem150Test {
    private final Problem150 solution = new Problem150();
    
    @Test
    public void example1() {
        assertThat(solution.evalRPN(new String[] {"2","1","+","3","*"}), is(9));
    }
    
    @Test
    public void example2() {
        assertThat(solution.evalRPN(new String[] {"4","13","5","/","+"}), is(6));
    }
    
    @Test
    public void example3() {
        assertThat(solution.evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}), is(22));
    }
}
