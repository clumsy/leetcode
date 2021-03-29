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
    
    @Test
    public void example4() {
        int[][] costs = {{440,704},{481,140},{810,854},{34,150},{684,360},{516,301},{790,678},
            {138,893},{899,260},{881,499},{500,572},{419,657},{179,234},{965,136},{826,886},
            {880,913},{362,934},{747,219},{676,17},{847,713}};
        assertThat(solution.twoCitySchedCost(costs), is(7911));
    }
    
    @Test
    public void example5() {
        int[][] costs = {{10,10},{30,30},{400,400},{30,30}};
        assertThat(solution.twoCitySchedCost(costs), is(470));
    }
}
