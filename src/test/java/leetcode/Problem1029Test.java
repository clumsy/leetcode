package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1029Test {
    private final Problem1029 solution = new Problem1029();
    
    @Test
    public void example1() {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertThat(solution.twoCitySchedCost(costs), is(110));
    }
    
    @Test
    public void example2() {
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        assertThat(solution.twoCitySchedCost(costs), is(1859));
    }
    
    @Test
    public void example3() {
        int[][] costs = {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        assertThat(solution.twoCitySchedCost(costs), is(3086));
    }
}
