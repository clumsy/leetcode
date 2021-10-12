package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem399Test {
    private final Problem399 solution = new Problem399();
    
    @Test
    public void example1() {
        List<List<String>> equations =
            Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("b","c"));
        double[] values = {2,3};
        List<List<String>> queries =
            Arrays.asList(
                Arrays.asList("a","c"),
                Arrays.asList("b","a"),
                Arrays.asList("a","e"),
                Arrays.asList("a","a"),
                Arrays.asList("x","x"));
        assertThat(solution.calcEquation(equations, values, queries), is(new double[] {6,0.5,-1,1,-1}));
    }
    
    @Test
    public void example2() {
        List<List<String>> equations =
            Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("b","c"),
                Arrays.asList("bc","cd"));
        double[] values = {1.5,2.5,5.0};
        List<List<String>> queries =
            Arrays.asList(
                Arrays.asList("a","c"),
                Arrays.asList("c","b"),
                Arrays.asList("bc","cd"),
                Arrays.asList("cd","bc"));
        assertThat(solution.calcEquation(equations, values, queries), is(new double[] {3.75,0.4,5,0.2}));
    }
    
    @Test
    public void example3() {
        List<List<String>> equations =
            Arrays.asList(
                Arrays.asList("a","b"));
        double[] values = {0.5};
        List<List<String>> queries =
            Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("b","a"),
                Arrays.asList("a","c"),
                Arrays.asList("x","y"));
        assertThat(solution.calcEquation(equations, values, queries), is(new double[] {0.5,2,-1,-1}));
    }
    
    @Test
    public void example4() {
        List<List<String>> equations =
            Arrays.asList(
                Arrays.asList("x1","x2"),
                Arrays.asList("x2","x3"),
                Arrays.asList("x3","x4"),
                Arrays.asList("x4","x5"));
        double[] values = {3.0,4.0,5.0,6.0};
        List<List<String>> queries =
            Arrays.asList(
                Arrays.asList("x1","x5"),
                Arrays.asList("x5","x2"),
                Arrays.asList("x2","x4"),
                Arrays.asList("x2","x2"),
                Arrays.asList("x2","x9"),
                Arrays.asList("x9","x9"));
        assertThat(solution.calcEquation(equations, values, queries), is(new double[] {360,0.008333333333333333,20,1,-1,-1}));
    }
}
