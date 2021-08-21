package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem319Test {
    public final Problem319 solution = new Problem319();
    
    @Test
    public void example1() {
        assertThat(solution.bulbSwitch(3), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.bulbSwitch(0), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.bulbSwitch(1), is(1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.bulbSwitch(10000000), is(3162));
    }
}
