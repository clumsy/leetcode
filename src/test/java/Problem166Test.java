import leetcode.Problem166;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem166Test {
    private final Problem166 solution = new Problem166();
    
    @Test
    public void example1() {
        assertThat(solution.fractionToDecimal(1, 2), is("0.5"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.fractionToDecimal(2, 1), is("2"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.fractionToDecimal(2, 3), is("0.(6)"));
    }
    
    @Test
    public void example4() {
        assertThat(solution.fractionToDecimal(4, 333), is("0.(012)"));
    }
    
    @Test
    public void example5() {
        assertThat(solution.fractionToDecimal(1, 5), is("0.2"));
    }
    
    @Test
    public void example6() {
        assertThat(solution.fractionToDecimal(7, -12), is("-0.58(3)"));
    }
    
    @Test
    public void example7() {
        assertThat(solution.fractionToDecimal(-50, 8), is("-6.25"));
    }
    
    @Test
    public void example8() {
        assertThat(solution.fractionToDecimal(-1, -2147483648), is("0.0000000004656612873077392578125"));
    }
    
    @Test
    public void example9() {
        assertThat(solution.fractionToDecimal(0, -5), is("0"));
    }
}
