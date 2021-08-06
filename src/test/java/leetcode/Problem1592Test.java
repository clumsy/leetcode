package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1592Test {
    private final Problem1592 solution = new Problem1592();
    
    @Test
    public void example1() {
        assertThat(solution.reorderSpaces("  this   is  a sentence "), is("this   is   a   sentence"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.reorderSpaces(" practice   makes   perfect"), is("practice   makes   perfect "));
    }
    
    @Test
    public void example3() {
        assertThat(solution.reorderSpaces("hello   world"), is("hello   world"));
    }
    
    @Test
    public void example4() {
        assertThat(solution.reorderSpaces("  walks  udp package   into  bar a"), is("walks  udp  package  into  bar  a "));
    }
    
    @Test
    public void example5() {
        assertThat(solution.reorderSpaces("a"), is("a"));
    }
}
